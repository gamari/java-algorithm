package gamari.design.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private static final int NUM_HANDS = 3;

    private final Random random;
    private Hand.HandValue prevHandValue;
    private Hand.HandValue currentHandValue;
    private final int[][] history;

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
        this.prevHandValue = Hand.HandValue.GUU;
        this.currentHandValue = Hand.HandValue.GUU;
        this.history = new int[NUM_HANDS][NUM_HANDS];

        for (int i = 0; i < NUM_HANDS; i++) {
            for (int j = 0; j < NUM_HANDS; j++) {
                history[i][j] = 1;
            }
        }
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        Hand.HandValue nextHandValue = determineNextHand(bet);

        prevHandValue = currentHandValue;
        currentHandValue = nextHandValue;
        return Hand.getHand(nextHandValue);
    }

    private Hand.HandValue determineNextHand(int bet) {
        int current = currentHandValue.getValue();

        for (Hand.HandValue value : Hand.HandValue.values()) {
            if (bet < history[current][value.getValue()]) {
                return value;
            }
            bet -= history[current][value.getValue()];
        }

        return Hand.HandValue.PAA;
    }

    private int getSum(Hand.HandValue handValue) {
        int sum = 0;
        int value = handValue.getValue();

        for (int i = 0; i < NUM_HANDS; i++) {
            sum += history[value][i];
        }

        return sum;
    }

    @Override
    public void study(boolean win) {
        int prev = prevHandValue.getValue();
        int current = currentHandValue.getValue();

        if (win) {
            history[prev][current]++;
        } else {
            history[prev][(current + 1) % NUM_HANDS]++;
            history[prev][(current + 2) % NUM_HANDS]++;
        }
    }
}

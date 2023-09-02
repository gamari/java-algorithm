package gamari.design.strategy;

import java.util.Random;

import gamari.design.strategy.Hand.HandValue;

public class WinnerStrategy implements Strategy {
    Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinnerStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        if (!won) {
            HandValue[] values = HandValue.values();
            prevHand = Hand.getHand(values[random.nextInt(values.length)]);
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }

}

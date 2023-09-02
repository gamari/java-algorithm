package gamari.design.strategy;

import java.util.EnumMap;

public class Hand {
    public enum HandValue {
        GUU(0), CHO(1), PAA(2);

        private final int value;

        HandValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private static final EnumMap<HandValue, Hand> hands = new EnumMap<>(HandValue.class);
    private static final EnumMap<HandValue, String> names = new EnumMap<>(HandValue.class);

    static {
        hands.put(HandValue.GUU, new Hand(HandValue.GUU));
        hands.put(HandValue.CHO, new Hand(HandValue.CHO));
        hands.put(HandValue.PAA, new Hand(HandValue.PAA));

        names.put(HandValue.GUU, "グー");
        names.put(HandValue.CHO, "チョキ");
        names.put(HandValue.PAA, "パー");
    }

    private final HandValue handValue;

    private Hand(HandValue handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(HandValue handValue) {
        return hands.get(handValue);
    }

    public boolean isStrongerThan(Hand other) {
        return compareHands(other) == 1;
    }

    public boolean isWeakerThan(Hand other) {
        return compareHands(other) == -1;
    }

    private int compareHands(Hand other) {
        if (this.handValue == other.handValue) {
            return 0;
        } else if ((this.handValue.ordinal() + 1) % 3 == other.handValue.ordinal()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return names.get(handValue);
    }
}

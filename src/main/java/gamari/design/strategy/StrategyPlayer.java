package gamari.design.strategy;

public class StrategyPlayer {
    private Strategy strategy;

    public StrategyPlayer(Strategy strategy) {
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        // TODO
    }
}
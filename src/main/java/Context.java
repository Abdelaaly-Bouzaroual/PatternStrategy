public class Context {

    private Strategy strategy = new DefaulStrategyImpl();

    public void applyStrategy() {
        strategy.perform();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;

    }
}

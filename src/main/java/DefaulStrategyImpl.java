public class DefaulStrategyImpl implements Strategy {
    @Override
    public void perform() {
        System.out.println("Application de la Strategy par défault");
    }
}

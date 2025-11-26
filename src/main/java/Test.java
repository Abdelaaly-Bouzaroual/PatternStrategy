import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Context context = new Context();
//        System.out.println("---------------------");
//        context.applyStrategy();
//        System.out.println("---------------------");
//        context.setStrategy(new StratergyImp1());
//        context.applyStrategy();
//        System.out.println("---------------------");
//        context.setStrategy(new StratergyImp2());
//        context.applyStrategy();
//        System.out.println("---------------------");
//        context.setStrategy(new StratergyImp3());
//        context.applyStrategy();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the name Strategy you wish to use: ");
            String strategyName = scanner.nextLine();
            Class statrategyClassName = Class.forName(strategyName);
            Strategy strategy = (Strategy) statrategyClassName.newInstance();
            context.setStrategy(strategy);
            context.applyStrategy();

        }
    }


}

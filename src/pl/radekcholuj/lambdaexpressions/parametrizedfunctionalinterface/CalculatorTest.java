package pl.radekcholuj.lambdaexpressions.parametrizedfunctionalinterface;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator<Integer> multiply = (tab) -> {
            int tmp = 1;
            for (int value :tab) {
                tmp*=value;
            }
            return tmp;
        };
        System.out.println("4 * 1 * 5 = " +multiply.calculate(new Integer[] {4,1,5}));
    }
}

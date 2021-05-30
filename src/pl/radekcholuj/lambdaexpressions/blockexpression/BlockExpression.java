package pl.radekcholuj.lambdaexpressions.blockexpression;

public class BlockExpression {
    public static void main(String[] args) {
        ArrayOperations swap = (tab, i, j) -> {
            int tmp = tab[i];
            tab[i] = tab[j];
            tab[j] = tmp;
        };
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.print(number+ ", ");
        }

        System.out.println();

        swap.run(numbers, 0, 4);

        for (int number : numbers) {
            System.out.print(number+ ", ");
        }

        System.out.println("\n-------- multiply -----------");
        Calculator multiply = (tab) -> {
            int tmp = 1;
            for (int value :tab) {
                tmp*=value;
            }
            return tmp;
        };
        System.out.println("4 * 1 * 5 = " +multiply.calculate(new int [] {4,1,5}));
    }
}

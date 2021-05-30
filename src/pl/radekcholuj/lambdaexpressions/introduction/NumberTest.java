package pl.radekcholuj.lambdaexpressions.introduction;

public class NumberTest {
    public static void main(String[] args) {
        // 1
        Validator isEven = n -> n % 2 == 0;
        System.out.println("------ isEven ------");
        System.out.println("2 : " + isEven.validate(2));
        System.out.println("3 : " + isEven.validate(3));
        System.out.println("74 : " + isEven.validate(74));

        //2
        Validator isFromRange = n -> n >= 5 && n <= 55;
        System.out.println("----- isFromRange -----");
        System.out.println("5124 : " + isFromRange.validate(5124));
        System.out.println("12 : " + isFromRange.validate(12));
        System.out.println("51 : " + isFromRange.validate(51));
    }
}

public class calculator {
    public static void main(String[] args) {
//developed//java calculator.


        int addedResult = add(100, 65);
        System.out.println("Added ..." + addedResult);

        int subtractedResult = sub(2, 50);
        if (subtractedResult == 0) {
            System.out.println("subtracted value is negative");
        }
        System.out.println("Subtracted ..." + subtractedResult);

        int multiplyResult = mul(20, 5);
        System.out.println("Multipiled ..." + multiplyResult);

        double dividedResult = div(1000, 100);
        System.out.println("divided ..." + dividedResult);
    }

    public static int sub(int x, int y) {
        if (y > x) {
            return 0;
        }
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        double dividedValue = x / y;
        return dividedValue;
    }

    public static int add(int x, int y) {
        return x + y;
    }
}

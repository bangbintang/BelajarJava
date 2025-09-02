public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 7;

        if (isEven(number)) {
            System.out.println(number + " adalah bilangan genap");
        } else {
            System.out.println(number + " adalah bilangan ganjil");
        }
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
}

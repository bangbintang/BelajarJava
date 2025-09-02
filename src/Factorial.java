public class Factorial {
    public static void main(String[] args) {
        int number = 5;

        long result = factorial(number);

        System.out.println("Bilangan : " + number);
        System.out.println("Faktorial : " + result);
    }

    private static long factorial(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Angka harus >= 0");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

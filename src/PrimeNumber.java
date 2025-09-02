public class PrimeNumber {
    public static void main(String[] args) {
        int number = 31;

        if (isPrime(number)) {
            System.out.println(number + " adalah bilangan prima");
        } else {
            System.out.println(number + " bukan bilangan prima");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class NumberIsAmstrongOrNot {
    public static void main(String[] args) {
        int number = 407; // amstrong 3 digit 153, 370, 371, 407. 4 digit 1634, 8208, 9474

        if (isAmstrong(number)) {
            System.out.println(number + " adalah Amstrong number");
        } else {
            System.out.println(number + " bukan Amstrong number");
        }
    }

    private static boolean isAmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }
}

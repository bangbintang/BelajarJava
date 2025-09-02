public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("=== ArithmeticOperator ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int penjumlahan = a + b;
        System.out.println("penjumlahan (a + b) =  " + penjumlahan);

        int pengurangan = a - b;
        System.out.println("pengurangan (a - b) = " + pengurangan);

        int perkalian = a * b;
        System.out.println("perkalian (a * b) = " + perkalian);

        int pembagian = a / b;
        System.out.println("pembagian (a / b) = " + pembagian);

        int modulus = a % b;
        System.out.println("sisa bagi (a % b)" + modulus);
    }
}

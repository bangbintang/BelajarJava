//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainApp {
    public static void main(String[] args) {
//    String nama = "Bintang";
//    int umur = 29;
//    int umurMuda = 17;
//    int hasil = umur + umurMuda;
//    int pengurangan = umur - umurMuda;
//    int perkalian = umur * 2;
//    int pembagian = perkalian / 2;
//    int modulus = umur %5;
//    System.out.println(hasil);
//    System.out.println(pengurangan);
//    System.out.println(perkalian);
//    System.out.println(pembagian);
//    System.out.println(modulus);

//        for(initialisasi; condition; action){
//          proses
//        }

//        for(int x = 0; x<=10; x++){
//            System.out.println(x + " " + "test");
//            if(x == 5){
//             System.out.println(x + " " + "ping");
//            }
//        }

        int cctvPlat = 6;
        for(int x = cctvPlat; x <= cctvPlat; x++){
            int result = x %2;
            if (result == 0){
                System.out.println("genap");
            }
            else if (result == 1){
                System.out.println("ganjil");
            }
        }
    }
}
package percabangan;

import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {

        // bikin variabel dan scanner
        int nilai; // mendeklarasikan variabel nilai dengan tipe data integer
        String nama; // mendeklarasikan variabel nama dengan tipe data string
        Scanner scan = new Scanner(System.in); // menggunakan import java.util.Scanner dalam menjalankan variabel scan dari hasil input dengan System.in

        // mengambil input
        System.out.print("Nama : ");
        nama = scan.nextLine(); // disini untuk menginput dari console log nama
        System.out.print("Nilai : ");
        nilai = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda tidak lulus");
        }
    }
}

package prosedurdanfungsi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FungsiProsedur {
    static ArrayList<String> listBuah = new ArrayList<>();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void main(String[] args) throws IOException {
        do {
            showMenu();
        } while (isRunning);
    }

    static void showMenu() throws IOException {
        System.out.println("========= MENU =======");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU >");

        int selectedMenu = Integer.parseInt(input.readLine());

        switch (selectedMenu) {
            case 1 -> showAllBuah();
            case 2 -> insertBuah();
            case 3 -> editBuah();
            case 4 -> deleteBuah();
            case 5 -> System.exit(0);
            default -> System.out.println("Pilihan salah!");
        }
    }

    static void showAllBuah() {
        if (listBuah.isEmpty()) {
            System.out.println("Belum ada data");
        } else {
            for (int i = 0; i < listBuah.size(); i++) {
                System.out.println(String.format("[%d] %s", i, listBuah.get(i)));
            }
        }
    }

    static void insertBuah() throws IOException {
        System.out.print("Nama buah: ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }

    static void editBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomor buah: ");
        int indexBuah = Integer.parseInt(input.readLine());

        System.out.print("Nama baru: ");
        String namaBaru = input.readLine();

        listBuah.set(indexBuah, namaBaru);
    }

    static void deleteBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomor buah: ");
        int indexBuah = Integer.parseInt(input.readLine());
        listBuah.remove(indexBuah);
    }
}
package hashmap;

import java.util.HashMap;

public class CobaHashMap {
    public static void main(String[] args) {
        // membuat objek hashmap
        HashMap<Integer, String> days = new HashMap<Integer, String>();

        // mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jumat");
        days.put(7, "Sabtu");

        // mencetak semua  isi dari objek days
        System.out.println("Isi objek days: " + days);
        // mengambil hari senin
        System.out.println("Hari kedua: " + days.get(2));

        // menghapus malam minggu
        days.remove(1);
        System.out.println("Isi objek days: " + days);

        // mengubah hari minggu menjadi hari ahad, rabu -> rebo,
        days.put(1, "Ahad");
        days.replace(4, "rebo");
        System.out.println("Isi objek days: " + days);

        // menghapus semua hari
        days.clear();
        System.out.println("Isi objek days: " + days);

    }
}

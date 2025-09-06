package hashmap;

import java.util.HashMap;
import java.util.Map;

public class BukuHashMap {
    public static void main(String[] args){
        // membuat objek hashmap
        HashMap<String, Buku> books = new HashMap<String, Buku>();

        // membuat objek buku
        Buku bukuJava = new Buku("Tutorial Java", "Bintang Code");
        Buku bukuKotlin = new Buku("Tutorial Kotlin", "Bintang Code");
        Buku bukuAndroid = new Buku("Tutorial Android", "Bintang Code");

        // mengisi objek hashmap dengan objek buku
        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);

        // cetak semua buku
        for(Map.Entry b: books.entrySet()) {
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        }
    }
}

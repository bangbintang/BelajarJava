public class CountWord {
    public static void main(String[] args) {
     String sentence = "Belajar Java itu menyenangkan dan bermanfaat";

     int wordCount = countWords(sentence);

     System.out.println("Kalimat : " + sentence);
     System.out.println("Jumlah kata : " + wordCount);
    }

    private static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        // Pisahkan kata berdasarkan spasi (satu atau lebih spasi)
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}

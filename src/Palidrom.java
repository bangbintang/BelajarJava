public class Palidrom {
    public static void main(String[] args) {
        String text = "malam";

        if (isPalidrom(text)) {
            System.out.println(text + " adalah Palidrom");
        } else {
            System.out.println(text + " bukan Palidrom");
        }
    }

    private static boolean isPalidrom(String text) {
        if (text == null) {
            return false;
        }

        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Pangram {

    public static boolean isPangram(String s) {

        s = s.toLowerCase();

        if (s.length() < 26)
            return false;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (!s.contains(ch + "")) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "a quick brown fox jumps over the lazy dog";

        System.out.println(isPangram(s));
    }
}

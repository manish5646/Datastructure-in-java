public class LoToUp {

    public static void main(String[] args) {

        String s = "aBcD";

        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            char c = ch[i];

            if (c >= 'a' && c <= 'z') {
                ch[i] -= 32;
            }
            else if (c >= 'A' && c <= 'Z') {
                ch[i] += 32;
            }
        }

        System.out.println(ch);
    }
}

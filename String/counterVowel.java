package String;

public class counterVowel {
    public static void main(String[] args) {
        String s1 = "Hello I am Java Developer";
        String s2 = "AEIOU";
        String up = s1.toUpperCase();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < up.length(); i++) {
            if (s2.contains(String.valueOf(up.charAt(i)))) {
                sb.append(++count);
            } else {
                sb.append(up.charAt(i));
            }
        }
        System.out.println("\n" + sb);
    }
}

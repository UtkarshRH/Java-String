package String;

public class Vowel {
    public static void main(String[] args) {
        String s1 = "Education";
        String s2 = "AEIOU";
        String up = s1.toUpperCase();
        int count = 0;
        for (int i = 0; i < up.length(); i++) {
            if (s2.contains(String.valueOf(up.charAt(i)))) {
                count++;
            }
        }
        System.out.println("The Number of Vowel in the string is: " + count);
    }
}

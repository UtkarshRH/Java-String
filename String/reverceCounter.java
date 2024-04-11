package String;

public class reverceCounter {
    public static void main(String[] args) {
        String s1 = "Hello I am java Developer";
        String s2 = "aeiou";
        String lo = s1.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < lo.length(); i++) {
            if (s2.contains(String.valueOf(lo.charAt(i)))) {
                count++;
            }
        }
        for (int i = 0; i < lo.length(); i++) {
            if (s2.contains(String.valueOf(lo.charAt(i)))) {
                sb.append(count--);
            } else {
                sb.append(lo.charAt(i));
            }
        }
        System.out.println("\n" + sb);
    }
}

package String;

public class firstToLast {
    public static void main(String[] args) {
        String s1 = "Utkarsh";
        StringBuilder sb = new StringBuilder();
        sb.append(s1.substring(1));
        sb.append(s1.charAt(0));
        System.out.println(sb);
    }
}

package String;

public class fToLandLtoF {
	public static void main(String[] args) {
		String s1 = "Utkarsh";
		StringBuilder sb = new StringBuilder();
		sb.append(s1.charAt(s1.length() - 1));
		sb.append(s1.substring(1, s1.length() - 1));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}
}
package old;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(reverseString2("Hiren Tamhane"));
	}
	
	private static String reverseString(String s) {
		StringBuffer sb = new StringBuffer("");
		int stringLength=s.length()-1;
		for(int i=0;i<=stringLength;i++) {
			sb.append(s.charAt(stringLength-i));
		}
		return sb.toString();
	}
	
	private static String reverseString2(String s) {
		return new StringBuffer(s).reverse().toString();
	}
}

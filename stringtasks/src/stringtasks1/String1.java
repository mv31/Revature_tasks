package stringtasks1;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi my last words are in uppercase";
		System.out.println(convertToTitleCase(s));
	}
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(ar[w].substring(0,ar[w].length()-1));
			sb.append(Character.toUpperCase(ar[w].charAt(ar[w].length()-1)));
			sb.append(" ");
		}
		return sb.toString().trim();
	}


}

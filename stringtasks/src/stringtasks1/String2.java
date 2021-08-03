package stringtasks1;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello hi good noon hope we got thread safety";
		System.out.println(convertToTitleCase(s));

	}
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			if(ar[w].length()%2!=0) {
				int a = (ar[w].length()/2)+1;
				sb.append(ar[w].substring(0,a));
				sb.append(Character.toUpperCase(ar[w].charAt(a)));
				sb.append(ar[w].substring(a+1));
				sb.append(" ");
				
			}else {
				sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
			
			}
			
		}
		return sb.toString();
	}
}

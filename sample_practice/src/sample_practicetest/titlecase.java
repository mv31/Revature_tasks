package sample_practicetest;

public class titlecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titlecase("hi my name is manoj mv"));

	}
	public static String titlecase(String s) {
		StringBuilder sb  = new StringBuilder();
		String ar[] = s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			 sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1));
			
		}
		return sb.toString();
	}

}

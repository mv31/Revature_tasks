package stringtasks1;
import java.util.*;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ispalli("hello is our mam came here"));
	}
	public static String ispalli(String s) {
		String a[] = s.split(" ");
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if(ispalindrome(a[i])) {
				sb.append(a[i]).append(" ");
			}else {
				sb.append(new StringBuilder(s).reverse().toString()).append(" ");
				
			}
		}
			return sb.toString();
		
		

	}
	public static boolean ispalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}

}

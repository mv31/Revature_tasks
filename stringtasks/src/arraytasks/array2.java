package arraytasks;
import java.lang.*;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,5,7,10,13,17};
		System.out.println("Prime numbers:");
		for (int i = 0; i < a.length; i++) {
			if(isprime(a[i])) {
				System.out.println(a[i]+" ");
			}
		}

	}
	public static boolean isprime(int n) {
		boolean b = true;
		if(n==0 || n==1){
			b=false;
		}else if(n==2) {
			b=true;
			
		}else {
			for (int i = 0; i < Math.sqrt(n); i++) {
				if(n%10==0) {
					b=false;
					break;
				}
			}
		}
		return b;
	}

}

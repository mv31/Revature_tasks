package arraytasks;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {100,101,1000,1001,1001,3000,20002};
		System.out.println("PalindromeNumbers are:");
		for (int i = 0; i < a.length; i++) {
			if(ispalindrome(a[i])) {
				System.out.println(a[i]+" ");
		}
		}
		}
	public static boolean ispalindrome(int n) {
		int k=0,n1,n2;
		n2=n;
		while(n2!=0) {
			n1=n2%10;
			k=k*10+n1;
			n2/=10;
		}
		if(n==k) {
			return true;
		}else {
			return false;
		}
	}
	
	}


package problemsOnPattern;

public class Alphabets2 {
	public static void main(String[]args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print((char)(64+j)+" ");
		
			}
			System.out.println();
	}

}
	}

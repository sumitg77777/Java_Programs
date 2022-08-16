package problemsOnPattern;

public class Alphabets1 {
	public static void main (String[]args) {
		int n=5;
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j));
			}
			System.out.println();
		
	}
		//System.out.println();

}
}
package problemsOnPattern;

public class Pattern9star7starTill1Star {
	public static void main (String[]args) {
		int n=5;
		
		for(int i=n;i>=0;i--) { //reverse
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
		
	}
			System.out.println();
		
}
		}
	}


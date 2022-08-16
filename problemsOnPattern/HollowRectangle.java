package problemsOnPattern;

public class HollowRectangle {
	public static void main (String[]args) {
		
		int n=10;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(i==1||i==10||j==1||j==10) {
					System.out.print("1");
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.println();
			}
		}
	}



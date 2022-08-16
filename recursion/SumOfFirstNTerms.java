package recursion;

public class SumOfFirstNTerms {
	public static void Sumnterms(int i,int n,int sum ) {
		if(i==n) {
			
		
		sum=sum+i;
		System.out.println(sum);
		return;
		
	}
	sum=sum+i;
	Sumnterms(i+1,n,sum);
	System.out.println(i);
	
	}
	
	public static void main (String[]args) {
		int n=5;
		Sumnterms(1,5,0);
		
	}

}

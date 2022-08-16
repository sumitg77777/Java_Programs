package problemsOnString;

public class ReverseString {
	public static void main (String[]args) {
		String str="Sumit";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			String reverse=rev+str.charAt(i);
		
			System.out.print("the reverse string is :"+reverse);
		}
	}

	
}
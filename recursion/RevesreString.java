package recursion;

public class RevesreString {
	public static void  printrev(String str,int indx) {
		if(indx==0) {
			System.out.println(str.charAt(indx));
			return;
		}
		System.out.println(str.charAt(indx));
		printrev(str,indx-1);
	}
	public static void main (String[]args) {
		String str="abcde";
		printrev(str,str.length()-1);
		
	}

}

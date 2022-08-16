package problemsOnString;

public class RemoveDuplicateCharacter {
	
	public static void main (String[]args) {
		String str="abbbcccaaadddcccaadd";
		System.out.println("old string "+str);
		System.out.println("new string"+rmvduplicate(str));
	}
	public static String rmvduplicate(String str) {
		String newstr=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(newstr.indexOf(ch)==-1) {
				newstr=newstr+ch;
			}
		}
	
	return newstr;

}
}
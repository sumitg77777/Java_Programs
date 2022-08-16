package problemsOnPattern;

public class Star0star00 {
	public static void main( String[]args){
	//	int n=4;
		 int lines=4;    
		    int i,j;    
		    for(i=1;i<=lines;i++){
		      for(j=1;j<=lines;j++){ 
		          if(i==j)    
		             System.out.print("*");    
		            else    
		           System.out.print("0");    
		      }    
		      j--;    
		       System.out.print("*");    
		      while(j>=1){   
		          if(i==j)    
		           System.out.print("*");    
		          else    
		           System.out.print("0");    
		          j--;    
		      }    
		    System.out.println("");    
		  }    
		         }    
		}
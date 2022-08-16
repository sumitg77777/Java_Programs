package problemsOnArray;

public class FindMaxElement {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,300,12,33,66};
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
			System.out.println(max);
			
		}
		
		// TODO Auto-generated method stub

	}





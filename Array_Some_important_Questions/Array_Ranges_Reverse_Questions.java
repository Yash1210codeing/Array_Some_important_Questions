package Array_Some_important_Questions;
public class Array_Ranges_Reverse_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[]arr= {8,7,6,5,4,3,2,1};
	        // Function Call
	        reverse(arr,3,5);
	        // output Print Loop
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]+" ");
	        }
		}
		public static void reverse(int[]arr,int s,int e) {
			// Array Element Reverse Pointer From to From
			int i=s;
			int j=e;
			// Index Loop
			while(i<j) {
				//Swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				// index Increment Decrement
				i++;
				j--;
			}
	}

}

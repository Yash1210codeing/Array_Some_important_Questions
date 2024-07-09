package Array_Some_important_Questions;
public class Reverse_Array_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };
		// Function Call
		reverse(arr);
		// output Print Loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void reverse(int[] arr) {
		// Array Element Reverse Pointer From to From
		int i = 0;
		int j = arr.length - 1;
		// Index Loop
		while (i < j) {
			// Swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			// index Increment Decrement
			i++;
			j--;
		}
	}
 }

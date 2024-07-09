package Array_Some_important_Questions;
import java.util.*;
public class Array_Ranges_Reverse_Questions_User_Input {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int []arr=new int[size];
       // Array Element input Loop
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       // Array Reverse Range Pointer input
       int i=sc.nextInt();
       int j=sc.nextInt();
       reverse(arr,i,j);
       //System.out.println(arr);
       for(int k=0;k < arr.length;k++) {
    	   System.out.print(arr[k]+" ");
       }
	}
	public static void reverse(int []arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}

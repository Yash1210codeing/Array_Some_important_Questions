package Array_Some_important_Questions;

public class Kadens_Alogorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Maxsum(arr));
	}
    public static int Maxsum(int[]arr) {
    	int ans=Integer.MIN_VALUE;
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum=sum+arr[i];
    		ans=Math.max(ans,sum);
    		if(sum<0) {
    			sum=0;
    		}
    	}
    	return ans;
    }
}

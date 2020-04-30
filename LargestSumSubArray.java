package aa;
import java.util.*;
public class LargestSumSubArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[]arr=new int[n];
		int cursum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n;i++) {
			cursum+=arr[i];
			if(maxsum<cursum) {
				maxsum=cursum;
			}
			if(cursum<0) {
				cursum=0;
			}
			
		}
		System.out.println(maxsum);
	}
}
 
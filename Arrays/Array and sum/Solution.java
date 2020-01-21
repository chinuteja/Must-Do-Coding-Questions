import java.util.*;
/**
 * Using sorting technique
 */
public class Solution {
	public static void findPair(int[] arr,int sum){
		int right = arr.length-1;
		int left = 0;
		Arrays.sort(arr);
		// System.out.println("After sorting "+Arrays.toString(arr));
		while(left < right) {
			if (arr[left] + arr[right] == sum) {
				// System.out.println("left "+left+" right "+right);
				// System.out.println("Sum exits between"+left + " "+right +"indices");
				return;
			} else if (arr[left] + arr[right] < sum) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println("Sum doesnot exits");
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n ; i++ ) {
			arr[i] = scan.nextInt();
		}
		// System.out.println("enter req sum");
		int sum = scan.nextInt();
		System.out.println(Arrays.toString(arr));
		findPair(arr,sum);

	}
}
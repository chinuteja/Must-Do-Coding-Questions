import java.util.*;
/**
 * Using sorting technique
 */
public class Solution {
	public static boolean triplet(int[] array, int sum) {
		Arrays.sort(array);
		for (int i = 0; i < array.length - 2 ; i++) {
			int left = i + 1;
			int right = array.length - 1;
			while (left < right) {
				if (array[i] + array[left] + array[right] == sum) {
					System.out.println("the triplets are " + array[i] + " " + array[left] + " " + array[right]);
					return true;
				} else if (array[i] + array[left] + array[right] < sum)
					left++;
				else
					right--;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n ; i++ ) {
			array[i] = scan.nextInt();
		}
		System.out.println("enter the sum");
		int sum = scan.nextInt();
		triplet(array, sum);
	}
}
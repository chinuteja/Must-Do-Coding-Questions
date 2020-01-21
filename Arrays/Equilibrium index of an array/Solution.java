import java.util.*;

public class Solution {
	public static int equlibrium(int[] arr, int size) {
		int left_sum = 0;
		int right_sum = 0;
		for (int i = 0; i < size; i++)
			right_sum += arr[i];
		for (int i = 0; i < size ; i++) {
			right_sum = right_sum - arr[i];
			if(left_sum == right_sum)
				return i;
			left_sum += arr[i];  
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int arr_size = arr.length;
		System.out.println(equlibrium(arr, arr_size));
	}
}
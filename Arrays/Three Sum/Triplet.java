import java.util.*;

public class Triplet {
	public static boolean triplet(int[] array, int sum) {
		for (int i = 0; i < array.length - 2; i++) {
			HashSet<Integer> set = new HashSet();
			int curr_sum = sum - array[i];
			for (int j = i+1;j<array.length-1 ; j++) {
				if (set.contains(curr_sum - array[j])) {
					int temp = curr_sum - array[j];
					System.out.println("elements are "+array[i] +" " +array[j] +" "+ temp);
					return true;
				}
				set.add(array[j]);
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
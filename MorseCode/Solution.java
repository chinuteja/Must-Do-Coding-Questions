/* Java program to find best
meeting point in 2D array*/
import java.util.*;

class Solution {

	static int minTotalDistance(int grid[][],int ROW,int COL) {
		if (ROW == 0 || COL == 0)
			return 0;

		ArrayList<Integer> vertical = new ArrayList<Integer>();
		ArrayList<Integer> horizontal = new ArrayList<Integer>();

		// Find all members home's position
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (grid[i][j] == 1) {
					vertical.add(i);
					horizontal.add(j);
				}
			}
		}
		Collections.sort(vertical);
		Collections.sort(horizontal);
		int size = vertical.size() / 2;
		int x = vertical.get(size);
		int y = horizontal.get(size);
		int distance = 0;
		for (int i = 0; i < ROW; i++)
			for (int j = 0; j < COL; j++)
				if (grid[i][j] == 1)
					distance += Math.abs(x - i) +
					            Math.abs(y - j);

		return distance;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] grid = new int[row][col];
		for (int i =0;i<row ;i++ ) {
			for (int j =0;j<col ;j++ ) {
				grid[i][j] = scan.nextInt();
			}
		}
		System.out.println(minTotalDistance(grid,row,col));
	}
}



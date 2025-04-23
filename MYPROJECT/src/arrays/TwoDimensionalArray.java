package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] myArr = {{2, 7, 9},{1, 3, 6},{4, 8, 0}};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(myArr[i][j] + " ");
			}
		}
		System.out.println();
}
}
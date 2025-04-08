package bse1_oop_groupa_2022;
import java.io.*;
import java.util.ArrayList;

public class MyArrays {

	public static void main(String[] args)throws IOException {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int [] nums = new int [5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter an integer");
			nums[i] = Integer.parseInt(buf.readLine());
		}
		for(int n = 0; n < 5; n++ ) {
		System.out.print(nums[n] + " ");
		}
	}

}

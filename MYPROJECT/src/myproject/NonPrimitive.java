package myproject;
public class NonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test";
		System.out.println("String is " + str);
		
		String str1 = new String("test2");
		System.out.println("Another string is " + str1);
		
		int arr[];
		arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		//System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[2]); 
	}

}

package simpleprogs;

public class AddLoop{
    public static void main(String[] args) {
        int [ ] myArr = {1, 2, 3, 4, 5, 6, 7};
        int sum=0;
        for(int x=0; x<myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}
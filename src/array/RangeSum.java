package array;
import java.util.Scanner;
public class RangeSum {
    static void main() {
        System.out.println("enter the starting point of sum");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println("enter the ending point of sum");
        int b=in.nextInt();
        int sum=0;
        int [] arr={1,2,3,4,5,6,7,8,98,9,9,9,5,33};
        for(int i=a-1; i<b; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("the sum of given range is :"+sum);
    }
}

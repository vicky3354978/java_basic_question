package array;
import java.util.Scanner;
public class SumOfArray {
    static void main() {
        int n;
        System.out.println("enter the size of array");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }

        int sum=0;
        System.out.println("the sum of array is :"+sum);
        for(int i=0; i<n; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("the sum of array is :"+sum);
    }
}

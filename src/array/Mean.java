package array;

import java.util.Scanner;

public class Mean {
    static void main() {
        int n;
        System.out.println("enter the size of array");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum=sum+a[i];
        }
        float avg=(float)sum/n;
        System.out.println("the avg of all element :"+avg);
    }
}

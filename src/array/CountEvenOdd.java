package array;

import java.util.Scanner;

public class CountEvenOdd {
    static void main() {
        int n;
        System.out.println("enter the array size ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] a=new int[n];
        System.out.println("enter in numbers ");
        for(int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
        }
        int countEven=0;
        int countOdd=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }

        }
        System.out.println("the total number of odd is :"+countOdd);
        System.out.println("the total number of even is :"+countEven);

    }
}

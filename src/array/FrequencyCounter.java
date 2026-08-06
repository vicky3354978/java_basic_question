package array;

import java.util.Scanner;

public class FrequencyCounter {
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
        System.out.println("enter the number which you need to find their frequency");
        int m=in.nextInt();
        int count=0;
        for(int i=0; i<n;i++)
        {
            if(m==a[i]) {
                count++;
            }

        }
        System.out.println("the frequency of given number is "+count);
    }

}

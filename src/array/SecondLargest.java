package array;

import java.util.Scanner;

public class SecondLargest {
    static void main() {
        int largest;
        int secondLargest;
        int n;
        System.out.println("enter the size of array");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        largest=arr[0];
        secondLargest=0;
        for (int i=1; i<n; i++)
        {
            if(largest<arr[i])
            {
                secondLargest=largest;
                largest=arr[i];
            }
        }
        System.out.println("the second largest number is :"+secondLargest);
    }
}

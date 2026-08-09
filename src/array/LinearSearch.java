package array;

import java.util.Scanner;

public class LinearSearch {
    static void main() {
        int n;
        System.out.println("enter the size of array");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array element");
        for(int i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the number which you want to find ");
        int s=in.nextInt();
        for(int i=0; i<n; i++)
        {
            if(s==arr[i]) {
                System.out.println("element is found at index :" + (i+1));
                return;
            }
        }
        System.out.println("not found ");
    }
}

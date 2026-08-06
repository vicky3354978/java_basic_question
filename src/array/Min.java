package array;

import java.util.Scanner;

public class Min {
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
            int min;
            min=a[0];
            for(int i=1; i<n; i++)
            {
                if(min>a[i])
                {
                    min=a[i];
                }
            }
            System.out.println("the maximum number of the array is :"+min);

        }


    }


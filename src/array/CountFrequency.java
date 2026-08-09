package array;
import java.util.Scanner;
public class CountFrequency {
    static void main() {
        int[] a={1,2,2,2,5,};
        System.out.println("enter the number which you want frequency ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=0; i<a.length; i++)
        {
            if(n==a[i])
            {
                count++;
            }
        }
        System.out.println("the frequency of given number "+n+" is "+count);

    }
}

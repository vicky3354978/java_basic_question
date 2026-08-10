package array;

public class CheckSorted {
    static void main() {
        int[] n={1,2,3,4,10};
        for(int i=0; i<n.length-1; i++)
        {
            if(n[i]>n[i+1])
            {
                System.out.println("array not sorted ");
                return;
            }
        }
        System.out.println("sorted ");
    }

}

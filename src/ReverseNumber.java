public class ReverseNumber {
    static void main() {
        int num=1234;
        int rev=0;
        int digit;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("the reverse number is :"+rev);
    }
}

package StringProgram;

public class CheckStringPalindromeOrNot {
    static void main() {
        String word="121";
        char charAtStart;
        char charAtLast;
        int i=0;
        int j=word.length()-1;
        while(i<j)
        {
            if(word.charAt(i)==word.charAt(j))
            {
                i++;
                j--;
            }
            else {
                System.out.println("the given String is not palindrome ");
                return;
            }
        }
        System.out.println("the given String is palindrome ");

    }
}

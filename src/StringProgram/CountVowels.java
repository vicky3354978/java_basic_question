package StringProgram;

public class CountVowels {
    static void main() {
        String word;
        word="viceeeeeeooooky";
        int count=0;
        char c;
        for (int i=0;i<word.length();i++)
        {
            c=word.charAt(i);
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
            {
                count++;
            }
        }
        System.out.println("the totalnumber of vowels is :"+count);
    }
}

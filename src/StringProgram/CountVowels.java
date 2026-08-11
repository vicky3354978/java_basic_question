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
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'|| c=='A' || c=='I'||c=='E'||c=='O'||c=='U')
            {
                count++;
            }
        }
        System.out.println("the total number of vowels is :"+count);
    }
}

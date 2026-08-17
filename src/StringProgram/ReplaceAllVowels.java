package StringProgram;

public class ReplaceAllVowels {
    static void main() {
        String word="hello";
        StringBuilder result =new StringBuilder(word);
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
            {
                result.setCharAt(i,'*');
            }
        }
        System.out.println("the replaced String is "+result);
    }
}

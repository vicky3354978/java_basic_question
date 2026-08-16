package StringProgram;

public class CountDigitAlphabet {
    static void main() {
        String word="he5ll@@@o1233";
        char a;
        int countDigit=0;
        int countAlphabet=0;
        int count=0;
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)>=48 && word.charAt(i)<57)
            {
                countDigit++;
            }
            // A–Z  → 65–90
            // a–z  → 97–122
            // 0–9  → 48–57
            else if((word.charAt(i)>=65 && word.charAt(i)<90) || (word.charAt(i)>=97 && word.charAt(i)<122))
            {
                countAlphabet++;
            }
            else {
                count++;
            }
        }
        System.out.println("the total number of digits "+countDigit);
        System.out.println("the total number of alphabets "+countAlphabet);
        System.out.println("the total number of special char. "+count);


    }
}

package StringProgram;

public class CountDigitsAndAlphabet {
    static void main() {
        String name;
        name="Vicky Kumar";
        int countDigit=0;
        int countAlphabet=0;
        char c;
        for(int i=0;i<name.length(); i++)
        {
           // A–Z  → 65–90
           // a–z  → 97–122
           // 0–9  → 48–57
            c=name.charAt(i);
            if(c>=65 && c<=90 && c>=97 && c<=122)
            {
                countAlphabet++;
            }
        }
    }
}

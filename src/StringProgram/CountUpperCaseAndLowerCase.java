package StringProgram;

public class CountUpperCaseAndLowerCase {
    static void main() {
        String name;
        name="Vicky Kumar";
        int countUpper=0;
        int countLower=0;
        char c;
        for(int i=0; i<name.length(); i++)
        {
            c=name.charAt(i);
            if(c>=65 && c<=90)
            {
                countUpper++;
            }
            else {
                countLower++;
            }
        }

        System.out.println("total lower case number is :"+countLower);
        System.out.println("total upper case number is :"+countUpper);

    }
}

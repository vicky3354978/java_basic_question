package StringProgram;

public class ConvertIntoUppercase {
    static void main() {
        String name="Vicky";
        char a;
        char newName;
        String upper="";
        for(int i=0;i<name.length(); i++)
        {
            if(name.charAt(i)>97 && name.charAt(i)<=122)
            {
                a=name.charAt(i);
                newName=(char)(a-32);
                upper=upper+newName;
            }
            else {
                System.out.print(name.charAt(i));
            }
        }

        System.out.println(upper);
    }
}

package StringProgram;

public class RemoveAllSpace {
    static void main() {
        String sentence="hello i am vicky";
        StringBuilder result=new StringBuilder(sentence);
            for(int i=0; i<result.length(); i++)
            {
                if(result.charAt(i)==' ')
                {
                    result.deleteCharAt(i);
                    i--;
                }
            }
        System.out.println("the result is :"+result);
    }
}

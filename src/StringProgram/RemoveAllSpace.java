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
                    //this i-- check the next index is space or not
                }
            }
        System.out.println("the result is :"+result);
    }
}

package StringProgram;

public class FindLargestWord {
    static void main() {
        String sentence="aaaaa aaaa aaa aaaaaaa";
        String[] word=sentence.split(" ");
        String largest=word[0];
        for(int i=1; i<word.length; i++)
        {
                if(largest.length() < word[i].length())
                {
                    largest=word[i];
                }
        }
        System.out.println("the largest word is :"+largest);
    }
}

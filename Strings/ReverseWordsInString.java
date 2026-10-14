public class ReverseWordsInString {
    public static void main(String[] args) {
        String s="The Sky is Blue";
        System.out.println(reversestring(s));
    }
    static String reversestring(String s)
    {
        String[] words=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            result.append(words[i]);
            if(i>0)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

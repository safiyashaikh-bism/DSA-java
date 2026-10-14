public class StringCompression {
    public static void main(String[] args) {
        char[] chars={'a'};
        System.out.println(compression(chars));
    }
    static int compression(char[] chars)
    {
        int index=0;
        int i=0;
        while(i<chars.length)
        {
            char current=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==current)
            {
                count++;
                i++;
            }
            chars[index]=current;
            index++;
            if(count>1)
            {
                for(char digit:String.valueOf(count).toCharArray())
                {
                    chars[index]=digit;
                    index++;
                }
            }
        }
        return index;
    }
}

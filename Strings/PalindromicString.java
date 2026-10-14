public class PalindromicString {
    public static void main(String[] args) {
        String s="aba";
        System.out.println(countsubstring(s));
    }
    static int countsubstring(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count=count+expand(s,i,i);
            count=count+expand(s,i,i+1);
        }
        return count;
    }
        static int expand(String s,int left,int right)
    {
        int count=0;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            count++;
            left--;
            right++;
        }
        return count;
    }

        
    
}

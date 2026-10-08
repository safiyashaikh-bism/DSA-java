public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s="abcbcabc";
        System.out.println(longestsubstring(s));
    }
    static int longestsubstring(String s)
    {
        int left=0;
        int right=0;
        int maxlength=0;
        boolean[] seen=new boolean[128];
        while(right<s.length())
        {
            while(seen[s.charAt(right)])
            {
                seen[s.charAt(left)]=false;
                left++;
            }
            seen[s.charAt(right)]=true;
            maxlength=Math.max(maxlength,right-left+1);
            right++;
        }
        
        return maxlength;
    }
}

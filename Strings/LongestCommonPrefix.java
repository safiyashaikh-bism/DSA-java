public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s={"flower","flow","flight"};
        System.out.println(longestcommonprefic(s));
    }
    static String longestcommonprefic(String[] s)
    {
        String prefix=s[0];
        for(int i=1;i<s.length;i++)
        {
            String current=s[i];
            while(current.indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}

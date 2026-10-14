
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s="abab";
        String p="ab";
        System.out.println(findanagrams(s,p));
    }
    static List<Integer> findanagrams(String s,String p)
    {
        List<Integer> result=new ArrayList<>();
        
        if(p.length() > s.length())
        {
            return result;
        }
        int[] pfreq=new int[26];
        int[] windowfreq=new int[26];
        for(int i=0;i<p.length();i++)
        {
            pfreq[p.charAt(i)-'a']++;
            windowfreq[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pfreq, windowfreq)) {
            result.add(0);
        }

        for(int right = p.length(); right < s.length(); right++) {

            windowfreq[s.charAt(right) - 'a']++;

            windowfreq[s.charAt(right - p.length()) - 'a']--;

            if(Arrays.equals(pfreq, windowfreq)) {
                result.add(right - p.length() + 1);
            }
        }

        return result;
        
    }
}

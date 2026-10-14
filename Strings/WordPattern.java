
import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";
        System.out.println(wordpattern(pattern,s));
    }
    static boolean wordpattern(String pattern,String s)
    {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length)
        {
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> used =new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(words[i]))
                {
                    return false;
                }
            }
            else
            {
                if(used.contains(words[i]))
                {
                    return false;
                }
                map.put(c,words[i]);
                used.add(words[i]);
            }
        }
        return true;
    }
}

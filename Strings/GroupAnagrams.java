
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s={"eat","ate","eta","tan","ant"};
        System.out.println(groupAnagrams(s));
    }
    static List<List<String>> groupAnagrams(String[] s)
    {
        HashMap<String,List<String>> map=new HashMap<>();
        for (String word : s) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);

        String key = new String(chars);

        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(word);
    }
         return new ArrayList<>(map.values());
    }
}

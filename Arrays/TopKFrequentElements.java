import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] n={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topelements(n,k)));
    }
    static int[] topelements(int[] n,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:n)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> numbers = new ArrayList<>(map.keySet());

        
        numbers.sort((a, b) -> map.get(b) - map.get(a));

       
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = numbers.get(i);
        }

        return result;
    }
}

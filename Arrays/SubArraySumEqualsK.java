import java.util.*;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int k=3;
        System.out.println(sum(arr,k));
    }
    static int sum(int[] arr,int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    int prefixSum = 0;
    int count = 0;

    for (int num : arr) {
        prefixSum += num;

        int required = prefixSum - k;

        count += map.getOrDefault(required, 0);

        map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }

    return count;
    }
}

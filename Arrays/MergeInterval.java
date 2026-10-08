import java.util.Arrays;
public class MergeInterval {
    public static void main(String[] args) {
        int[][] arr={
            {1,3},
            {2,6},
            {8,10},
            {15,18}

        };
        int[][] ans=merge(arr);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] merge(int[][] arr)
    {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int[][] result=new int[arr.length][2];
        int index = 0;
        result[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]<=result[index][1])
            {
                result[index][1]=Math.max(result[index][1],arr[i][1]);
            }
            else
            {
                index++;
                result[index]=arr[i];
            }
        } 
        return Arrays.copyOf(result, index+1);
    }
}

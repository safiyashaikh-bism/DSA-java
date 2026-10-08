import java.util.Arrays;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals={
            {1,3},
            {6,9}

        };
        int[] newinterval={2,5};
        int[][] ans=insert(intervals,newinterval);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] insert(int[][] intervals,int[] newinterval)
    {
        int[][] result=new int[intervals.length+1][2];
        int index=0;
        int i=0;
        while(i<intervals.length&&intervals[i][1]<newinterval[0])
        {
            result[index]=intervals[i];
            index++;
            i++;
        }
        while(i<intervals.length&&intervals[i][0]<=newinterval[1])
        {
            newinterval[0]=Math.min(newinterval[0],intervals[i][0]);
            newinterval[1]=Math.max(newinterval[1],intervals[i][1]);
            i++;
        }
        result[index]=newinterval;
        index++;
        while(i<intervals.length)
        {
            result[index]=intervals[i];
            index++;
            i++;
        }
        return Arrays.copyOf(result, index);
    }
}

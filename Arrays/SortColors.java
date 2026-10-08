
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,2,3,2,3};
        int[] ans=sortcolors(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortcolors(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}

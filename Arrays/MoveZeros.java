import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,3};
        int[] ans=move(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] move(int[] arr)
    {
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index=index+1;
            }
        }
        for(int i=index;i<arr.length;i++)
        {
            arr[i]=0;
        }
        return arr;
    }
}

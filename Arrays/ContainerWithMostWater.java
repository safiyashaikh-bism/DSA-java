
import static java.lang.Integer.min;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int ans=mostwater(arr);
        System.out.println(ans);
    }
    static int mostwater(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        int maxwater=0;
        while(left<right)
        {
            int width=right-left;
            int height=min(arr[left],arr[right]);
            int water=width*height;
            if(water>maxwater)
            {
                maxwater=water;
            }
            if(arr[left]<arr[right])
            {
                left++;
            }
            else{
                right--;
            }

        }
        return maxwater;
    }
}

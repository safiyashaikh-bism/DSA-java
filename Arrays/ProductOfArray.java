import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] ans=product(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] product(int[] arr)
    {
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int product=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    product=product*arr[j];
                }
            }
            ans[i]=product;
        }
        return ans;
    }
}

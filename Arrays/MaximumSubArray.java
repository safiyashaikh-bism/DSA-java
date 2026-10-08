public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr={-1,2,3};
        System.out.println(maxsubarray(arr));
    }
    static int maxsubarray(int[] arr)
    {
        int currentsum=arr[0];
        int maximumsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currentsum=currentsum+arr[i];
            if(currentsum<arr[i])
            {
                currentsum=arr[i];
            }
            if(currentsum>maximumsum)
            {
                maximumsum=currentsum;
            }
        }
        return maximumsum;
    }
}

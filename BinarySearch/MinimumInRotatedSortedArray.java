public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={0,4,5,2,3};
        System.out.println(findminimum(arr));
    }
    static int findminimum(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return arr[start];
    }
}

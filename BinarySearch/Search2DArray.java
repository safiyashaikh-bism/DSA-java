public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target=3;
        System.out.println(search(arr,target));
    }
    static boolean search(int[][] arr,int target)
    {
        int start=0;
        int end=arr.length*arr[0].length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int row=mid/arr[0].length;
            int col=mid%arr[0].length;
            if(arr[row][col]==target)
            {
                return true;
            }
            else if(arr[row][col]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        return false;
    }
}

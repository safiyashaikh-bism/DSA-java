public class SearchInRotatedSorteAarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0,1,2};
        int target=0;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(arr[start]<=arr[mid])
            {
                if(target>=arr[start]&&target<=arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>=arr[mid]&&target<=arr[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

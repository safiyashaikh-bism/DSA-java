public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(arr,h));
    }
    static int minEatingSpeed(int[] arr,int h)
    {
        int start=1;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>end)
            {
                end=arr[i];
            }
        }
        while(start<end)
        {
            int mid=start+(end-start)/2;
            long hours=0;
            for(int n:arr)
            {
                hours+=(n+mid-1)/mid;
            }
            if(hours<=h)
            {
                end=mid;

            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}

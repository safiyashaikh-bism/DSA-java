public class SplitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int k=2;
        System.out.println(splitarray(arr,k));
    }
    static int splitarray(int[] arr,int k)
    {
        int start=0;
        int end=0;
        for(int num:arr)
        {
            if(num>start)
            {
                start=num;
            }
            end=end+num;
        }
        while(start<end)
        {
            int mid=start+(end-start)/2;
            int parts=1;
            int sum=0;
            for(int num:arr)
            {
                if(sum+num<=mid)
                {
                    sum+=num;
                }
                else
                {
                    parts++;
                    sum=num;
                }
            }
            if(parts<=k)
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

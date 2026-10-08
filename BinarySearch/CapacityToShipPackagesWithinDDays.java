public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipwithindays(arr,days));
    }
    static int shipwithindays(int[] arr,int days)
    {
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>start)
            {
                start=arr[i];
            }
            end=end+arr[i];
        }
        while(start<end)
        {
            int mid=start+(end-start)/2;
            int daysrequired=1;
            int currentweight=0;
            for(int w:arr)
            {
                if(currentweight+w<=mid)
                {
                    currentweight+=w;
                }
                else{
                    daysrequired++;
                    currentweight=w;
                }
            }
            if(daysrequired<=days)
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}

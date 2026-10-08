public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,3};
        int[] arr2={2};
        System.out.println(findmedian(arr1,arr2));
    }
    static double findmedian(int[] arr1,int[] arr2)
    {
        if(arr1.length>arr2.length)
        {
            return findmedian(arr2, arr1);
        }
        int total=arr1.length+arr2.length;
        int half=(total+1)/2;
        int start=0;
        int end=arr1.length;
        while(start<=end)
        {
            int cut1=start+(end-start)/2;
            int cut2=half-cut1;
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int right1 = (cut1 == arr1.length) ? Integer.MAX_VALUE : arr1[cut1];

            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int right2 = (cut2 == arr2.length) ? Integer.MAX_VALUE : arr2[cut2];
            if(left1<=right2&&left2<=right1)
            {
                int leftMax = Math.max(left1, left2);
                int rightMin = Math.min(right1, right2);

                if(total % 2 == 1)
                {
                    return leftMax;
                }

                return (leftMax + rightMin) / 2.0;
            }
            else if(left1 > right2)
            {
                end = cut1 - 1;
            }
            else
            {
                start = cut1 + 1;
            }
        }
        return 0.0;
    }
}

public class Majorityelements {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println(majorityelements(arr));
    }
    static int majorityelements(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>arr.length/2)
            {
                return arr[i];
            }
        }
        return -1;
    }
}

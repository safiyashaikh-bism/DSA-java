public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,4,2,6,5};
        System.out.println(missingno(arr));
    }
    static int missingno(int[] arr)
    {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;

        }
        for(int i=0;i<arr.length;i++)
        {
            sum=sum-arr[i];
        }
        return sum;
    }
}

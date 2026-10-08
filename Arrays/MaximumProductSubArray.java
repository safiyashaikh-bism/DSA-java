public class MaximumProductSubArray {

    public static void main(String[] args) {

        int[] arr = {-2, 3, -4};

        int ans = product(arr);

        System.out.println(ans);
    }

    static int product(int[] arr)
    {
        int currentproduct = arr[0];
        int minimumproduct = arr[0];
        int maximumproduct = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            int current = arr[i];

            int temp = maximumproduct;

            maximumproduct = Math.max(current,
                    Math.max(maximumproduct * current,
                             minimumproduct * current));

            minimumproduct = Math.min(current,
                    Math.min(temp * current,
                             minimumproduct * current));

            currentproduct = maximumproduct;

            if(currentproduct > maximumproduct)
            {
                maximumproduct = currentproduct;
            }
        }

        return maximumproduct;
    }
}
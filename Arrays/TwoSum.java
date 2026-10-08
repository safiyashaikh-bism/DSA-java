
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40};
        int target = 60;

        int[] arr = twoSum(nums, target);

        System.out.println(arr[0] + ", " + arr[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int sum = nums[i] + nums[j];

                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

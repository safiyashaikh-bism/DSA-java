
import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }

    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];
        int pos = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        return result;
    }
}

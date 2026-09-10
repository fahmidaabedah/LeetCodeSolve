import java.util.Arrays;
public class _268_MissingNumber {
    public int missingNumber(int[] nums) {
        int actual_sum = 0;
        int nums_sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            actual_sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            nums_sum += nums[i];
        }
        return actual_sum - nums_sum;
    }

}
//TC=O(n)
//SC=O(1)
public class _238_ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        //left prod
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left = nums[i] * left;
        }
        //right prod(final)
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = right * answer[i];
            right = right * nums[i];
        }
        return answer;
    }
}
//TC=O(n)
//SC=O(1)
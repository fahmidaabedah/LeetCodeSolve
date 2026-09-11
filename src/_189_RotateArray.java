public class _189_RotateArray {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < k; i++) {
            arr[i] = nums[nums.length - 1 - i];
        }
        for (int i = k; i < nums.length; i++) {
            arr[i] = nums[nums.length - k];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}
//TC = O(n)
//SC = O(n)
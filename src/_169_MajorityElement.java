public class _169_MajorityElement {
    public int majorityElement(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}
//TC=O(n^2)
//SC=O(1)

import java.util.Set;
import java.util.HashSet;
public class _349_IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersect.add(num);
            }
        }
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index] = num;
            index++;
        }
        return result;
    }
}
//TC=O(N+M)
//SC=O(N)
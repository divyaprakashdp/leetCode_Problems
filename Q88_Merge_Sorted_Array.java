import java.util.Arrays;

public class Q88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1, m, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}

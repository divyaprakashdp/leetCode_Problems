import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] test = {1,1,1,3,3,4,3,2,4,2};
//        int[] test = {1};
//        System.out.println(Q217_Contains_Duplicate.containsDuplicate(test));
//        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(Q53_Maximum_Subarray.maxSubArray(test));

//        int[] test = {8,6,3,1,9};
//        int[] test = {3,3};
//        System.out.println(Arrays.toString(Q1_Two_Sum.twoSum1(test, 6)));
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n =3;
        Q88_Merge_Sorted_Array.merge(nums1, m, nums2, n);
    }
}

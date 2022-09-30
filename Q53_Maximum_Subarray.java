public class Q53_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar=nums[0], maxEndingHere=nums[0];

        for(int i =0; i< nums.length;++i){
            maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

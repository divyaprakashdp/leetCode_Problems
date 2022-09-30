import java.util.HashMap;
import java.util.Map;

public class Q1_Two_Sum {
    //brute force
    public static int[] twoSum(int[] nums, int target) {
        //{8,6,3,1,9} 10
        int[] out = new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(target-nums[i]==nums[j]){
                    out[0]=i;
                    out[1]=j;
                }
            }
        }
        return  out;
    }

    //O(n)
    public static int[] twoSum1(int[] nums, int target) {
        //{8,6,1,3,9} 10 2,4,7,9,1
        int[] out = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }

            if(map.containsKey(target-nums[i])){
                if(i!=map.get(target-nums[i])){
                    out[1] = i;
                    out[0] = map.get(target-nums[i]);
                    break;
                }

            }

        }
        return  out;
    }
}

import java.util.HashSet;
import java.util.Set;

public class Q217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length==1){
            return false;
        }
        for(Integer i: nums){
            set.add(i);
        }
        return set.size() < nums.length;

    }
}

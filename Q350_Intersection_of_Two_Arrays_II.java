import java.util.ArrayList;
import java.util.HashMap;

public class Q350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int n: nums1){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n, 1);
            }
        }

        for(int n: nums2){
            if(map.containsKey(n) && map.get(n)>0){
                list.add(n);
                map.put(n, map.get(n)-1);
            }
        }

        int[] r = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            r[i] = list.get(i);
        }

        return r;
    }
}

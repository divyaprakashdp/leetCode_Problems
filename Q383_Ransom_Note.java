import java.util.Arrays;
import java.util.HashMap;

public class Q383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapRansom = countMap(ransomNote);
        HashMap<Character, Integer> mapMagazine = countMap(magazine);
        boolean result=false;
        for(Character c:mapRansom.keySet()){
            if(!mapMagazine.containsKey(c)) return false;
            if(mapRansom.get(c)<=mapMagazine.get(c)){
                result=true;
            }else{
                result=false;
                break;
            }


        }
        return result;
    }

    private static HashMap countMap(String s){
        HashMap<Character, Integer> mapRansom = new HashMap<>();
        for(Character c:s.toCharArray()){
            if(mapRansom.containsKey(c)){
                mapRansom.put(c,mapRansom.get(c)+1);
            }else{
                mapRansom.put(c,1);
            }

        }
        System.out.println(Arrays.toString(mapRansom.keySet().toArray(new Character[0])));
        System.out.println(Arrays.toString(mapRansom.values().toArray()));
        return mapRansom;
    }


}

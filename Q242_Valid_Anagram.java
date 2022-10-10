import java.util.HashMap;

public class Q242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = countMap(s);
        HashMap<Character, Integer> map2 = countMap(t);
        if(map2.size()!=map1.size()) return false;
        for(Character c:map1.keySet()){
            if(!map2.containsKey(c)) return false;
        }
        return map1.equals(map2);
    }

    private static HashMap<Character, Integer> countMap(String s){
        HashMap<Character, Integer> mapRansom = new HashMap<>();
        for(Character c:s.toCharArray()){
            if(mapRansom.containsKey(c)){
                mapRansom.put(c,mapRansom.get(c)+1);
            }else{
                mapRansom.put(c,1);
            }

        }
        return mapRansom;
    }


}

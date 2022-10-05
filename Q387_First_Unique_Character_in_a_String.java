import java.util.*;

public class Q387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        for(Character c:map.keySet()){
            if(map.get(c)==1){
                return s.indexOf(c);
            }
        }


        return -1;
    }
}

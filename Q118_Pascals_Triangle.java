import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Q118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0;i<numRows;i++){
            LinkedList<Integer> temp = new LinkedList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                } else {
                    int a = result.get(i-1).get(j);
                    int b = result.get(i-1).get(j-1);
                    temp.add(a+b);
                }


            }
            result.add(temp);
        }
        return result;
    }
}

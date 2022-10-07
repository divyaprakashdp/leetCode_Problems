import java.util.Arrays;

public class Q74_Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i< matrix.length;i++){
            int index =  Arrays.binarySearch(matrix[i],target);
            if(index>=0){
                return true;
            }
        }
        return false;
    }
}

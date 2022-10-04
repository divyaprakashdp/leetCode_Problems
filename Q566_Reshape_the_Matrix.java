import java.util.ArrayList;

public class Q566_Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        int k=0, l =0;
        if(r*c!=m*n) return mat;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++,l++){
                    if(l==c){
                        k++;
                        l=0;
                    }
                    result[k][l] = mat[i][j];
                }
            }
            return result;


    }
}

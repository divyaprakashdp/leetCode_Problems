import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] test = {1,1,1,3,3,4,3,2,4,2};
//        int[] test = {1};
//        System.out.println(Q217_Contains_Duplicate.containsDuplicate(test));
//        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(Q53_Maximum_Subarray.maxSubArray(test));

//        int[] test = {8,6,3,1,9};
//        int[] test = {3,3};
//        System.out.println(Arrays.toString(Q1_Two_Sum.twoSum1(test, 6)));
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3, n =3;
//        Q88_Merge_Sorted_Array.merge(nums1, m, nums2, n);
//        int[] nums1 = {1};
//        int[] nums2 = {1};
//        System.out.println(Arrays.toString(Q350_Intersection_of_Two_Arrays_II.intersect(nums1, nums2)));
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {7,6,4,3,1};
//        int[] prices = {2,4,1};
//        int[] prices = {2,1,2,1,0,1,2};
//        System.out.println(Q121_Best_Time_to_Buy_and_Sell_Stock.maxProfit(prices));
//        int[][] test = {{1,2},{3,4}};//00,01,10,11 -> 00,01,02,03
//        int[][] test = {{1,2},{3,4}};
//        System.out.println(Arrays.toString(Q566_Reshape_the_Matrix.matrixReshape(test, 4, 1)));

//        System.out.println(Q387_First_Unique_Character_in_a_String.firstUniqChar("leetcode"));
//        System.out.println(Q383_Ransom_Note.canConstruct("a", "b"));
//        System.out.println(Q383_Ransom_Note.canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
//        System.out.println(Q383_Ransom_Note.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
//        System.out.println(Q383_Ransom_Note.canConstruct("bhjdigif", "dbjdhdehgbcdjjgadeegdbegehjffie"));
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(Q36_Valid_Sudoku.isValidSudoku(board));
    }
}

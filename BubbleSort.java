public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {20,35,-15,7,55,1,-22};

        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                    swap(num, j, j+1);
                }
            }
        }

        for(int n:num){
            System.out.println(n);
        }
    }

    public static void swap(int[] nums, int i, int j){
        if(nums.length<1){
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

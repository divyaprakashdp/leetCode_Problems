public class Q121_Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE, sell=0;
        for(int n: prices){
            buy = Math.min(buy, n);
            sell = Math.max(sell, n-buy);
        }
        return sell;
    }
}

package org.example;

public class BestTimeBuyAndSell122 {
    public static void main(String[] args) {
        int[] ara = {1,5,7,2,3,4};
        int profit = getProfit(ara);
        System.out.println("Max profit is = "+profit);

    }

    public static int getProfit(int[] inValue){
        int profit = 0;
        for(int i = 1; i <inValue.length;i++ ){
            if(inValue[i]>inValue[i-1]){
                profit = profit+ inValue[i]-inValue[i-1];
            }
        }
        return profit;
    }

}

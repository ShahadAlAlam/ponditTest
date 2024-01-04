package org.example;

import java.math.*;

public class BestTimeBuyAndSell121 {
    public static void main(String[] args) {
        int[] ara = {1,5,7,2,3,4};
        int profit = getProfit(ara);
        System.out.println("Max profit is = "+profit);

    }

    public static int getProfit(int[] inValue){
        int profit = 0;
        int buy = inValue[0];
        int sell = 0;
        for(int i = 1; i <inValue.length;i++ ){
            sell = inValue[i];
            if(sell>buy){
                profit = getMax(profit,sell-buy);
            } else {
                buy = sell;
            }
        }
        return profit;
    }

    public static int getMax(int fst, int snd){
        return fst>snd?fst:snd;
    }
}

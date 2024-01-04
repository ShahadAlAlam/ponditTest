package org.example;

import java.util.Arrays;

public class BestTimeBuyAndSell123 {
    public static void main(String[] args) {
        int[] ara = {3,3,5,0,0,3,1,4};
        int profit = getProfit(ara);
        System.out.println("Max profit is = "+profit);
        int profit1 = getProfitCalculation(ara);
        System.out.println("Max profit is = "+profit1);

    }

    public static int getProfit(int[] inValue){
        int maxProfit = 0;
        int lengthInValue = inValue.length;
        int lengthInValueRevarse = inValue.length;
        int[] leftAra = new int[lengthInValue];
        int[] rightAra = new int[lengthInValue];
        int buyPrice = inValue[0];
        int sellPrice = inValue[lengthInValueRevarse-1];
        for (int i = 1 ; i < lengthInValue ; i++){
            if(buyPrice > inValue[i]){
                buyPrice = inValue[i];
            }
            int profit = inValue[i] - buyPrice;

            leftAra[i] = Math.max(leftAra[i-1],profit);
            lengthInValueRevarse = lengthInValue-1-i;

            if(inValue[lengthInValueRevarse] > sellPrice  ){
                sellPrice = inValue[lengthInValueRevarse];
            }
            profit = sellPrice -inValue[lengthInValueRevarse];

            rightAra[lengthInValueRevarse] = Math.max(rightAra[lengthInValue-i],profit);
        }

        System.out.println(Arrays.toString(leftAra));
        System.out.println(Arrays.toString(rightAra));

        for(int i = 0; i < lengthInValue ; i++){
            maxProfit = Math.max(maxProfit, leftAra[i]+rightAra[i]);
        }

        return maxProfit;
    }

    public static int getProfitCalculation(int[] inValueS){

        int minCostPrice = Integer.MAX_VALUE;
        int effectiveCostPrice = Integer.MAX_VALUE;
        int minProfit = 0;
        int maxProfit = 0;

        for(int inValue:inValueS){
            minCostPrice = Math.min(minCostPrice,inValue);
            minProfit = Math.max(minProfit,inValue - minCostPrice);
            effectiveCostPrice = Math.min(effectiveCostPrice, inValue - minProfit);
            maxProfit = Math.max(maxProfit, inValue - effectiveCostPrice);
        }

        return maxProfit;
    }
}

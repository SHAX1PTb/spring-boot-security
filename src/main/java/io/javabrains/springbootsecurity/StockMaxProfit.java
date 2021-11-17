package io.javabrains.springbootsecurity;

public class StockMaxProfit {

    public int maxProfit(int[] price){

        System.out.println();

        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i=0;i<price.length;i++){

            if(price[i] < minPrice){
                minPrice = price[i];
            }else if (price[i] - minPrice > maxPrice ){
                maxPrice = price[i] - minPrice;
            }
        }

        return maxPrice;
    }
}

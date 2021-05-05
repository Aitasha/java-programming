package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


              /** double max = prices[0];
        double min = prices[0];
        for(int i = 0; i < items.length; i++) {
            if(prices[i] > max) {
                max = prices[i];
            }if(prices[i] < min) {
                min = prices[i];
            }
        }*/


        double maxPrice = prices[0]; //assume first price is max
        int indexOfMaxPrice = 0;//assume max price is at index 0

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }

        }
       System.out.println(maxPrice);
        System.out.println(indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + "\t-$" + prices[indexOfMaxPrice] + "\t- #" + itemIDs[indexOfMaxPrice]);

    }
}

2. You work as a software engineer for a company that manages online retail stores. The company wants to implement a feature that provides real-time insights into daily sales trends. One of the key metrics is the cumulative sales amount up to a specific hour of the day.
The goal is to compute the prefix sum of the sales array, where each element in the array represents the sales amount at a specific hour. The prefix sum at any given hour is the total sales amount from the start of the day up to that hour.

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] Sales = {10, 20, 15, 30, 25};
        int[] PrefixSum = new int[Sales.length];
        
        int sum = 0;
        for (int i = 0; i < Sales.length; i++) {
            sum += Sales[i];
            PrefixSum[i] = sum;
        }
        
        System.out.println(Arrays.toString(PrefixSum));
    }
}

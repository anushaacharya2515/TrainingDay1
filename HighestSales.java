1.//A sales company wants to analyze daily sales data. Give an array of sales number find the day with the highest sales .
import java.util.*;

public class HighestSales{
    public static void main(String[] args) {
      int[] sales={120,340,560,780,980,250,430};
      int maxDays=0;
      for(int i=1;i<sales.length;i++)
        if(sales[i]>sales[maxDays])maxDays=i;
      System.out.println(maxDays+1);
  }
}

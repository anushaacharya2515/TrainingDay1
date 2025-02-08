import java.util.*;
public class ProductRating{
  public static void main(String[] args) {
    int count=0;
    double result=0;
    int final_count=0;
    double[] product={10.5,6.8,11.5,10.5,10.5,6.2,4.8};
      for(int i=0;i<product.length;i++)
      {
        count=1;
        for(int j=i+1;j<product.length;j++){
          if(product[i]==product[j]&& final_count<=count && product[i]!=result )
          {++count;
          result=product[i];}
        }
        if(count>final_count){
        final_count=count;
      }
      
      
      }
      
      System.out.println("The rating that appears most frequently is:"+result);
      //System.out.println(final_count);
      //System.out.println(" COUNT "+ count);
    
  }
}

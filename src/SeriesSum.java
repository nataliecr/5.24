import java.util.Scanner;

public class SeriesSum {
  public static void main(String[] args){
    double numerator = 1;
    double denom = 3;
    double sum = 0;
    
    while(numerator <= 97){
      sum = sum + (numerator / denom);  
      numerator = numerator + 2;
      denom = denom + 2;
    }
    
    System.out.println("sum: " + sum);
  } // main   
}

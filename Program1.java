/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

/**
 *
 * @author brand
 */
public class Program1 {

   
   
    public static void main(String[] args) {
        int tablesize = 10;
        printtable(tablesize);
    
    }
   public static void printtable(int tablesize ){
      for (int i = 1; i<=tablesize; i++){
       for (int j=1; j<=tablesize; j++){
           System.out.format("%4d",i*j);
       }
       System.out.println();
   }
   }
}

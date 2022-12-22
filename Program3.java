/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg3;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Program3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      DecimalFormat td = new DecimalFormat("0.00");
      System.out.println("Please enter number of adults");
      int adult = scan.nextInt();
      System.out.println("Please enter number of children");
      int child = scan.nextInt();
      System.out.println("Please enter adult cost");
      double adultcost = scan.nextDouble();
      System.out.println("Enter child cost");
      double childcost = scan.nextDouble();
      System.out.println("Enter dessert cost");
      double dessert = scan.nextDouble();
      System.out.println("Enter room rate");
      double roomrate = scan.nextDouble();
      System.out.println("Enter tip/tax");
      double tip = scan.nextDouble();
      tip = tip/100;
      System.out.println("Enter deposit");
      double deposit = scan.nextDouble();
      double adultcost1 = adultcost*adult;
      double childcost1 = child*(adultcost*.6);
      double dessert1 = dessert*(adult+child);
      double foodcost = adultcost1+childcost1+dessert1;
      double tip1 = tip*foodcost;
      double balance = foodcost+tip1+roomrate-deposit;
      System.out.println("Caswell Catering and Convention Service");
      System.out.println("                 Final Bill            ");
      System.out.println();
      System.out.println();
      System.out.println("               Number of Adults:                      "+adult);
      System.out.println("             Number of Children:                       "+child);
      System.out.println(" Cost per Adult without dessert:         $         "+td.format(adultcost));
      System.out.println(" Cost per child without dessert:         $          "+td.format(childcost));
      System.out.println("               Cost per dessert:         $          "+td.format(dessert));
      System.out.println("                       Room fee:         $         "+td.format(roomrate));
      System.out.println("               Tip and tax rate:                    "+td.format(tip));
      System.out.println();
      System.out.println();
      System.out.println("     Total cost for Adult meals:         $        "+td.format(adultcost1));
      System.out.println("     Total cost for Child meals:         $         "+td.format(childcost1));
      System.out.println("         Total cost for dessert:         $         "+td.format(dessert1));
      System.out.println("                Total food cost:         $        "+td.format(foodcost));
      System.out.println("               Plus tip and tax:         $         "+td.format(tip1));
      System.out.println("                  Plus room fee:         $         "+td.format(roomrate));
      System.out.println("                   Less deposit:         $        -"+td.format(deposit));
      System.out.println();
      System.out.println();
      System.out.println("                    Balance due:         $        "+td.format(balance));
    
      
      
      
    }
    
}

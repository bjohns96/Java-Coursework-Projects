/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

import java.util.Scanner;
public class Program2 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter username");
       String username = scan.next();
       System.out.println("Please enter password");
       String password = scan.next();
       if (username.equals("CSCI1302") && password.equals("FalL2020")){
       System.out.println("Correct. You may use your program.");
       System.out.println();
       System.out.println("Please enter grades");
       System.out.println();
              int grade=0;
              int sum = 0;
          for (int i=0; i<10; i++){
         System.out.println("Enter grade "+(i+1));
        grade = scan.nextInt();
        sum = sum+grade;
          }
         int avg = sum/10;
        System.out.println("The average is " + avg);
        switch (avg/10) {
            case 10:
            case 9: System.out.println("Achieved Grade A");
            break;
            case 8: System.out.println("Achieved Grade B");
            break;
            case 7: System.out.println("Achieved Grade C");
            break;
            case 6: System.out.println("Achieved Grade D");
            break;
            case 5:
            case 4:
            case 3: 
            case 2:
            case 1: System.out.println("Achieved Grade F");
            break;
            default: System.out.println("No grade available");
        }
    }
        else{    
        System.out.println("Please try again.");
       }
       }
    }

    


           
             
         
       


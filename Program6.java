/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg6;

import java.util.*;
import java.io.*; 
public class Program6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
       Scanner in = new Scanner(System.in);
       int [][] NumA = new int [3][4];
       int [][] NumB = new int [3][4];
       int [] NumC = {500};
       int count =1;
       for (int i=0;i<3;i++){
           for (int j=0;j<4;j++){
               NumA[i][j]=count;
               NumB[i][j]=count*10;
               count++;
           }
          }
       System.out.println("Arrangement A");
       for (int i=0;i<3;i++){
             for (int j=0;j<4;j++){
                 System.out.print(NumA[i][j]+" ");
             }
       }
       System.out.print("  ");
       for (int i=0;i<3;i++){
             for (int j=0;j<4;j++){
                 System.out.print(NumB[i][j]+" ");
             }
       }
       System.out.print("  ");
       System.out.print(NumC[0]+" ");
       
       System.out.println();
       System.out.println("Arrangement B");
        System.out.println("A");
        for (int i=0;i<3;i++){
             for (int j=0;j<4;j++){
                 System.out.print(NumA[i][j]+" ");
                 }
                System.out.println();
}
        System.out.println("B");
        for (int i=0;i<3;i++){
             for (int j=0;j<4;j++){
                 System.out.print(NumB[i][j]+" ");
                 }
             System.out.println();
            }
        System.out.println("C");
        for (int i=0;i<3;i++){
              System.out.println(NumC[0]+" ");
}
}
    }

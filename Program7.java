/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg7;

import java.util.*;
import java.io.*;
public class Program7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=4;
        do{
        System.out.println("Enter case number");
        System.out.println("1 for unique 4x4 array");
        System.out.println("2 for display of A and B");
        System.out.println("3 for magic square");
        num = scan.nextInt();
        switch (num){
           case 1: System.out.println("Array from Keyboard");
           Keyboard();
           break;
           case 2: System.out.println("Display Arrays");
           //1
           Display();
           break;
           case 3: System.out.println("Magic Square");
           Magicsquare();
           break;
           case 4: System.out.println("Exit");
           break;
           default : System.out.println("Please enter 1, 2, 3, or 4!");
       }
       }while (num !=4);{ 
       }
    }
    public static void Keyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are about to enter a 4x4 matrix.");
        int [][] x = new int [4][4];
       for (int i=0;i<4;i++){
           for (int j=0;j<4;j++){
               //Print enter location i,j
               System.out.println("Enter location "+i+","+j);
               x[i][j]=scan.nextInt();  
           } 
       }
        for (int i=0;i<4;i++){
             for (int j=0;j<4;j++){
                 System.out.print(x[i][j]+" ");
                }
             System.out.println();
         }   
    }
   public static void Display(){
       int [][] NumA = new int [4][4];
       int [][] NumB = new int [5][5];
       int [][] A = {{1,15,15,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
       int [][] B = {{11,10,4,23,17},{18,12,6,5,24},{25,19,13,7,1},{2,21,20,14,8},{9,3,22,16,15}};
       System.out.println("A");
       for (int i=0;i<4;i++){
             for (int j=0;j<4;j++){
                 System.out.print(A[i][j]+" ");
                }
             System.out.println();
         }
       System.out.println("B");
       for (int i=0;i<5;i++){
             for (int j=0;j<5;j++){
                 System.out.print(B[i][j]+" ");
                }
             System.out.println();
         }
   }
    public static void Magicsquare(){
       int [][] NumA = new int [4][4];
       int [][] NumB = new int [5][5];
       int [][] A = {{1,15,15,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
       int [][] B = {{11,10,4,23,17},{18,12,6,5,24},{25,19,13,7,1},{2,21,20,14,8},{9,3,22,16,15}}; 
           int rowone=0;
           int rowtwo=0; 
           int rowthree=0;
           int rowfour=0;
           int colone=0;
           int coltwo=0;
           int colthree=0;
           int colfour=0;
           int diagone=A[0][0]+A[1][1]+A[2][2]+A[3][3];
           int diagtwo=A[0][3]+A[1][2]+A[2][1]+A[3][0];
            for (int j=0;j<4;j++){
            rowone+=A[0][j];
            rowtwo+=A[1][j];
            rowthree+=A[2][j];
            rowfour+=A[3][j];
            colone+=A[j][0];
            coltwo+=A[j][1];
            colthree+=A[j][2];
            colfour+=A[j][3];
             }
          if (rowone == rowtwo && rowone == rowthree && rowone ==rowfour && rowone==colone && rowone==coltwo && rowone==colthree && rowone==colfour &&rowone==diagone && rowone==diagtwo){
                System.out.println("A is a magic square");
              }
            else 
                System.out.println("A is not a Magic Square");
          
           int diagoneb=B[0][0]+B[1][1]+B[2][2]+B[3][3];
           int diagtwob=B[0][3]+B[1][2]+B[2][1]+B[3][0];
            for (int j=0;j<4;j++){
            rowone+=B[0][j];
            rowtwo+=B[1][j];
            rowthree+=B[2][j];
            rowfour+=B[3][j];
            colone+=B[j][0];
            coltwo+=B[j][1];
            colthree+=B[j][2];
            colfour+=B[j][3];
             }
             if (rowone == rowtwo && rowone == rowthree && rowone ==rowfour && rowone==colone && rowone==coltwo && rowone==colthree && rowone==colfour &&rowone==diagoneb && rowone==diagtwob){
                System.out.println("B is a magic square");
              }
            else 
                System.out.println("B is not a Magic Square");
             System.out.println();
           }
    
    }
    


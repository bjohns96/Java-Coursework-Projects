/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg4;

import java.util.*;
import java.io.*;
public class Program4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      File myfile= new File("Prog4 (1).txt");
     Scanner infile = new Scanner(myfile);
     if (myfile.exists()){ 
         System.out.println("File Name is: "+myfile.getName());
     }else 
     System.out.println("The file doesn't exist!");
       String fname[]= new String[25];
     String lname[]= new String[25];
        int g1[]= new int [25];
        int g2[]= new int [25];
        int g3[]= new int [25];
        int g4[]= new int [25];
        int g5[]= new int [25];
        int avg[]= new int [25];
        int count = 0;
        do{
            fname[count]=infile.next();
            lname[count]=infile.next();
            g1[count]=infile.nextInt();
            g2[count]=infile.nextInt();
            g3[count]=infile.nextInt();
            g4[count]=infile.nextInt();
            g5[count]=infile.nextInt();
            count ++;
        }while(infile.hasNext());
        
        for(int i=0; i<count; i++){
            System.out.println(fname[i]+" "+lname[i]+" "+g1[i]+" "+g2[i]+" "+g3[i]+" "+g4[i]+" "+g5[i]);
            avg[i]=(g1[i]+g2[i]+g3[i]+g4[i]+g5[i])/5;
        System.out.println(fname[i]+"'s Average is: "+avg[i]);
           
        switch (avg[i]/5) {
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
            for (i=0;i<5;i++){
            for (int j=0; j<4-i;j++){
                if (avg[j]>avg[j+1]){
                    int temp=avg[j];
                    avg[j]=avg[j+1];
                    avg[j+1]=temp;
                    String temp1= fname[j];
                    fname[j]=fname[j+1];
                    fname[j+1]=temp1;
                }
        }
        
    }
    }
        }
        for (int i =0; i<g1.length; i++)
{
//Find Min
int currentMin= g1[i];
int currentMinIndex=i;
for (int j=i+1;j<g1.length;j++)
{
if(currentMin>g1[j]);
currentMinIndex=j;
//Check & Change
if (currentMinIndex!=i)
{
g1[currentMinIndex]=g1[i];
g1[i]=currentMin;
System.out.println("Swap Made");
}
}
}
System.out.println("Bsort swapped "+bsort+" times and Ssort swapped "+ssort+ " times.");
java.util.Arrays.sort(g5);
for(int i=0; i<g5.length;i++)
System.out.print(g5[i]+" ");
    }
    }

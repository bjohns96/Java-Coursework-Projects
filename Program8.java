/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program8;

/**
 *
 * @author brand
 */
public class Program8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [][] NumA = new int [5][5];
    int count =11;
         for (int i=0;i<5;i++){
             for (int j=0;j<5;j++){
                 NumA[j][i]=count++;
                  
             }
          }
         System.out.println("A");
         for (int i=0;i<5;i++){
             for (int j=0;j<5;j++){
         System.out.print(NumA[i][j]+" ");
    }
             System.out.println();
         }
         System.out.println();
      int sum=0;
for (int i=0;i<5;i++){
sum=NumA[2][i]+sum;
}
System.out.println("3rd row sum equals: "+sum);
System.out.println();

int max=NumA [0][0];
for (int i=0; i<NumA.length; i++){
if (NumA [i][0]>max){
max=NumA[i][0];
}
}
System.out.println("A's largest value:"+max);
System.out.println();

System.out.println("B");
int [] NumB= new int [5];
for (int i=0;i<5;i++){
NumB[i]=NumA[0][i]+NumA[1][i]+NumA[2][i]+NumA[3][i]+NumA[4][i];
System.out.print(NumB[i]+ " ");
}
System.out.println();
System.out.println();
System.out.println("Row 3 of A");
for (int i=0; i<5;i++){
NumA [2][i]= NumA[2][i]+NumA[1][i];
}
for (int i=0;i<5;i++){
for (int j=0;j<5;j++){
System.out.print(NumA[i][j]+" ");
}
System.out.println();
}
System.out.println();

System.out.println("Revised A");
int temp;
for (int i=0;i<4;i++){
temp= NumA[i][3];
NumA[i][3]=NumA[i][2];
NumA[i][2]=temp;
}
for (int i=0;i<5;i++){
for (int j=0;j<5;j++){
System.out.print(NumA[i][j]+" ");
}
System.out.println();
}
System.out.println();

int diag;
int diag1=0;
for (int i=0;i<5;i++){
diag= NumA[i][i];
diag1= diag1+diag;
}
System.out.println("First Diagonal Sum "+ diag1);

int diag2;
int diag3=0;
int i=0;
int largestdiag=0;
for (int j=4;j>=0;j--){
diag2= NumA[i][j];
diag3= diag3+diag2;
i++;
if (diag2>largestdiag){
    largestdiag=diag2;
}
}

System.out.println("Second Diagonal Sum "+ diag3);
System.out.println("Largest entry in diagonal is "+largestdiag);

int min=NumA [0][0];
int row=0;
int col=0;
for (int k=0; k<NumA.length; k++){
for (int j=0; j<NumA.length; j++){
if (NumA[k][j] < min){
min=NumA[k][j];
row=k;
col=j;
}
}
}
System.out.println("The smallest element in the array is : "+min+" row:"+row+" rolumn: "+col);

}
}
   

    

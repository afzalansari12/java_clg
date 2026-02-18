import java.util.Scanner;

public class matrixmult {
    
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("enter the no. of rows");
        
        int r = sc.nextInt();
        System.out.println("enter the no. of column");
    
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        int[][] brr = new int[r][c];

        int[][] result = new int[r][c];

        System.err.println("enter the first array ");
             for(int i = 0; i < r; i++){
             for(int j = 0; j < c; j++){
                 arr[i][j] = sc.nextInt();
            }
        }
          System.err.println("enter the second array ");
         for(int i = 0; i < r; i++){
             for(int j = 0; j < c; j++){
                  brr[i][j] = sc.nextInt();
             }
         }
           
         for (int i = 0; i < r; i++) {

         for  (int j = 0; j < c;j++){

         for(int k =0; k < c ;k++){

           result[i][j] = result[i][j] + arr[i][k]*brr[k][j];
                }
                
         }
     }

     for(int i = 0 ; i < r; i++){
        for(int j = 0; j < c; j++){
            System.out.print(result[i][j] + " ");

        }
        System.out.println();
     }
     sc.close();
   }

    
}

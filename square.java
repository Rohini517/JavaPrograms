import java.util.*;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        //int rows = inputNumber*2-1;
        //int coloumn = inputNumber*2-1;
         int j,i;
         for (i= 1;i<=inputNumber;i++){
             for (j=1;j<i;j++){
                System.out.print(j+" ");
             }
             for (j=i;j<=2*inputNumber-i;j++){
                System.out.print(i+" ");
             }
             for (j=i-1;j>=1;j--){
                System.out.print(j+" ");
             }
             System.out.println();

         }
        for (i= inputNumber-1;i>=1;i--){
             for (j=1;j<i;j++){
                System.out.print(j+" ");
             }
             for (j=i;j<=2*inputNumber-i;j++){
                System.out.print(i+" ");
             }
             for (j=i-1;j>=1;j--){
                System.out.print(j+" ");
             }
             System.out.println();

         }

         }
    
}

// 5
// 1 1 1 1 1 1 1 1 1 
// 1 2 2 2 2 2 2 2 1 
// 1 2 3 3 3 3 3 2 1 
// 1 2 3 4 4 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 
// 1 2 3 4 4 4 3 2 1 
// 1 2 3 3 3 3 3 2 1 
// 1 2 2 2 2 2 2 2 1 
// 1 1 1 1 1 1 1 1 1 
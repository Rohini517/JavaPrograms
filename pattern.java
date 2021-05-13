
import java.util.*;
public class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        
        for (int i=0;i<rows;i++){
            for (int j=0;j<=i;j++){
                int x= j;
                if (x==0){
                    int space = i;
                for (int k=0;k<space;k++){
                    System.out.print(" ");
                }
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}

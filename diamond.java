import java.util.*;
class diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        //int space = inputNumber-1;
         int j,i;
        for ( i = 0;i<=inputNumber;i++){
            for (j=i; j<=inputNumber-1;j++){
                System.out.print(" ");

            }
            for(j=i;j>0;j--){
                System.out.print(j);
            }
            for(j=0;j<=i;j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
        for (i=inputNumber-1;i>=0;i--){
            for (j=i; j<=inputNumber-1;j++){
                System.out.print(" ");

            }
            for(j=i;j>0;j--){
                System.out.print(j);
            }
            for(j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
      
    }
}


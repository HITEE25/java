import java.util.*;
public class halfpyramidonezero{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                 if(sum%2 == 0){
                    System.out.print("1");
                 }
                 else{
                    System.out.print("0");
                 }
            }
            System.out.println();
        }
    }
}
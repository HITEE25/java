import java.util.*;
public class square{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows\n");
    int row = sc.nextInt();
    System.out.println("Enter the number of coloumns\n");
    int col = sc.nextInt();
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
                System.out.print("*\t");
        }
        System.out.print("\n");
    }
   }
}
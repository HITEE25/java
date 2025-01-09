import java.util.*;
public class holorectangle {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int a = sc.nextInt();
    System.out.println("Enter the number of rows");
    int b = sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=0;j<=b;j++){
            if( i == 1 || j == 1 || j == b || i == a){
            System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print("\n");
    }
    }
}

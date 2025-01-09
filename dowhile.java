import java.util.*;
public class dowhile {
    public static void main(String args[]){
    int reversednumber=0,r;
    //input the number
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
do{
    r= n%10;//to get remainder
    reversednumber=reversednumber*10+r;
    n= n/10;//to make one digit less
    }while(n != 0);
    System.out.println("Reversed number :"+reversednumber);
}
}

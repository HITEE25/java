import java.util.*;
public class odd {
public static void main(String args[]){
    int i=1;
    float sum=0;
    float count=0,avg;
    Scanner sc = new Scanner(System.in);//input the number
    int n = sc.nextInt();
    while(i<=n){
        if(i%2 != 0){
        System.out.println(i);
        sum = sum +i;
        count++;
        }
        i++;
    }
    System.out.print("sum of numbers are");
    System.out.println(sum);
    avg = sum/count;
    System.out.print("avg of numbers are");
    System.out.println(avg);
    
}
    
}

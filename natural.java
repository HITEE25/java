import java.util.*;
public class natural {
public static void main(String args[]){
int sum=0,avg;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=1;i<=n;i++){
    System.out.println(i);
    sum += i;
}
avg = sum/n;
System.out.print("sum of numbers");
System.out.println(sum);
System.out.print("avg of numbers");
System.out.println(avg);
}
}
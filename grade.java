import java.util.*;
public class grade{
 public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();//is marks obtained
switch(n){//1-(80-100marks),2-(40-80marks),3-(0-40marks)
    case 1:System.out.println(  "grade=A");
    break;
    case 2:System.out.println("grade=B");
    break;
    case 3:System.out.println("fail");
    break;
    default:System.out.println("not a valid marks");          
}
}
}

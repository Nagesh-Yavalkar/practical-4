import java.util.*;
 public class que2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if(num%13==0){
            System.out.println(num+" is in table");
        } else{
            System.out.println(num+" is not in table");
        }
    }
}
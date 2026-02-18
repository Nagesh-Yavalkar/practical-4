import java.util.*;
public class que5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Float number :");
        float num = sc.nextFloat();
        if (num%6.00==0){
            System.out.println(num+" is divisible by 6.00");

        } else {
            System.out.println(num+" is not divisible by 6.00");

        }
    }
}
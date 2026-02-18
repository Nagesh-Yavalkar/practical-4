import java.util.*;
public class que7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Cost Price :");
        float num1 = sc.nextFloat();
        System.out.println("Enter your Selling Price :");
        float num2 = sc.nextFloat();
        float num3 = num2-num1;
        if(num3>0){
            System.out.println(num3+" is your profit");
        } else if (num3<0){
            System.out.println(num3+ " is your loss");
        } else{
            System.out.println("no profit no loss");
        }

    }
}
import java.util.*;
public class que6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Valid for Voting");
        } else if(age>=0 && age<=18){
            System.out.println("Invalid for Voting");

        }
        else{
            System.out.println("negative age is not allowed");
        }
    }
}
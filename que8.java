import java.util.*;
public class que8{
    public static void main(String[] argds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage :");
        float per = sc.nextFloat();
            if(per>85.00) {
            System.out.println("first class with distiction");
            } 
            else if(per<=85.00 && per>=75.00){
            System.out.println("first class ");
            } 
            else if(per<75.00 && per>=60.00){
            System.out.println("second class with distiction");

            } 
            else if (per<60.00 && per>=40.00){
            System.out.println("second class");
            } 
            else {
            System.out.println("fail");

        }
        }
    }

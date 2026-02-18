import java.util.*;
public class que4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark :");
        float mark = sc.nextFloat();
        if(mark>=85.00){
            System.out.println("you choose for medical");
        } 
        else if(mark<=85.00 && mark>=75.00){
            System.out.println("you choose for Engineering");

        }
        else if(mark>=60.00 && mark<=75.00){
            System.out.println("you choose for pharmacy");

        } else{
            System.out.println("you choose for Business");

        }
    }
}
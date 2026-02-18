import java.util.*;

public class que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your airbud budget :");

        int a  = sc.nextInt(); 
       
        if (a>2000) {
            System.out.println("Best company under this budget is boat");
        } else if (a>1500 && a<=2000) {
            System.out.println("Best company under this budget is realme");

        } else if (a>800 && a<1500) {
             System.out.println("Best company under this budget is boult");

        } else {
            System.out.println("Best company under this budget is aroma");

        }

       
    }
}

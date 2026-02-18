import java.util.*;
public class que9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num :");
        int a = sc.nextInt();
        System.out.println("Enter your second num :");
        int b = sc.nextInt();
        System.out.println("Enter your third num :");
        int c= sc.nextInt();
        if((a*a)==((b*b)+(c*c))||(b*b)==((c*c)+(a*a))||(c*c)==((a*a)+(b*b))){
        System.out.println("given number is pythagorous triplets");
            
        }else{
        System.out.println("given number is not pythagrous triplets");

        }

    }
}
package JavaAssignment3;
import java.util.*;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number");
        int first = sc.nextInt();
        System.out.println("Enter your second Number");
        int second = sc.nextInt();
        System.out.println("Enter your third Number");
        int third = sc.nextInt();

        if(first > second && first > third){
            System.out.println(first);
        }else if(second > first && second > third){
            System.out.println(second);
        }else if (first == second && second == third){
            System.out.println("its all are same");
        }else{
            System.out.println(third);
        }

    }
}

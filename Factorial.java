package JavaAssignment3;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial : ");
        int number = sc.nextInt();
        System.out.println(fact(number));
    }
    static int fact(int n){
        if(n == 1)
            return 1;
        return n * fact(n-1);
    }
}

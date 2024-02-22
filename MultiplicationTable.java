package JavaAssignment3;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table :");
        int number = sc.nextInt();
        for(int i = 1;i<21;i++){
            System.out.println(i + "x" + number + "=" + i*number);
        }
    }
}

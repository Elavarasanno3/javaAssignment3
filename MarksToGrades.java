package JavaAssignment3;

import java.util.Scanner;

public class MarksToGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Number / for hundred ::");
        int mark = sc.nextInt();
        if(mark > 10 && mark < 35)
            System.out.println("F");
        else if(mark > 34 && mark < 50)
            System.out.println("D");
        else if(mark > 49 && mark < 60)
            System.out.println("C");
        else if(mark > 59 && mark < 70)
            System.out.println("B2");
        else if(mark > 69 && mark < 80)
            System.out.println("B1");
        else if(mark > 79 && mark < 81)
            System.out.println("A2");
        else if(mark > 89 && mark <= 100)
            System.out.println("A1");
    }

}

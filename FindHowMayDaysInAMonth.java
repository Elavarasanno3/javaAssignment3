package JavaAssignment3;

import java.util.Scanner;

public class FindHowMayDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month :");
        int month = sc.nextInt();
        System.out.println("Enter the Year :");
        int year = sc.nextInt();
        if(year % 4 == 0 && month == 2){
            System.out.println(29);
        }else{
            switch (month){
                case 1,3,5,7,8,10,12 :
                    System.out.println("31");
                    break;
                case 4,6,9,11 :
                    System.out.println("30");
                    break;
                case 2 :
                    System.out.println("28");
                    break;
                default:
                    System.out.println("Enter valid Month...... ");
            }
        }

    }
}

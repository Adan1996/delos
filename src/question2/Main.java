package question2;

import java.util.*;

public class Main {
    public static String resString = "";
    public static String s1 = "";
    public static String s2 = "";
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Please input the (students, candies, first student): ");
        String input = inputs.nextLine();
        String[] strToArr = null;
        strToArr = input.split(" ");

        int students = Integer.parseInt(strToArr[0]);
        int candies = Integer.parseInt(strToArr[1]);
        int first_student = Integer.parseInt(strToArr[2]);

        System.out.printf("Students: %d, Candies: %d, First Student: %d\n", students, candies, first_student);
        
        for(int i = 0; i < candies; i++) {
            int result = first_student + i;
            
            if(result <= students) {
                int r1 = result;
                s1 = String.valueOf(r1);
            }

            if(result > students) {
                int r2 = result - students;
                s2 = String.valueOf(r2);
            }
            resString = s1 + s2;
            System.out.print(resString + " ");
        }

        System.out.printf("\n%s",resString);
        inputs.close();
    }
}

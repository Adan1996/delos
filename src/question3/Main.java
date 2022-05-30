package question3;

import java.util.*;

public class Main {
    public static Integer[] array;
    public static void main(String[] args) {
        Scanner inputsLength = new Scanner(System.in);
        System.out.print("Please input length of array: ");
        int length = inputsLength.nextInt();
        
        array = new Integer[length];
        Scanner inputsArr = new Scanner(System.in);
        System.out.print("Please input integers for the arrays: ");
        String arr = inputsArr.nextLine();
        System.out.println(arr);
        // for(int i = 0; i < length; i++) {
        //     System.out.print(array[i]);
            
        //     // if(array[i] > 4) {
        //     //     System.out.print(Arrays.asList(array).indexOf(array[i]));
        //     // }
        // }

        inputsLength.close();
        inputsArr.close();

        // Integer[] arr = {1, 3, 5, 4};


    }
}
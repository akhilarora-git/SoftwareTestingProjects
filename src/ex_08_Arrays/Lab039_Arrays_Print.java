package ex_08_Arrays;

import java.util.Arrays;

public class Lab039_Arrays_Print {
    public static void main(String[] args) {

        int[] marks = {11,23,41,22,12};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-------------------");

        for (int i = 0; i<marks.length; i++){

            System.out.println(marks[i]);
        }
        System.out.println("-------------------");
        Arrays.sort(marks);
        System.out.println("Sorted array:");
        for (int i = 0; i<marks.length; i++){

            System.out.println(marks[i]);
        }

    }
}

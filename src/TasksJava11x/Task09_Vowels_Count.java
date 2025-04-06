package TasksJava11x;

import java.util.Locale;
import java.util.Scanner;

public class Task09_Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(name);
        int length = name.length();
        System.out.println("Total length: "+length);

        int VowelsCount = 0, ConsonantCount = 0;
        for(int i=0; i<length; i++){
            char CharCount = name.charAt(i);
            if (CharCount >= 'a' && CharCount <= 'z' ){

                if (CharCount == 'a'|| CharCount == 'e'|| CharCount == 'i'|| CharCount == 'o'|| CharCount == 'u'){
                    VowelsCount++;
                }else{
                    ConsonantCount++;
                }
            }
        }

        System.out.println("The volwel count is: "+VowelsCount);
        System.out.println("The Consonant count is: "+ConsonantCount);
    }
}

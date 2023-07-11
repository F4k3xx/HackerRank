package org.example.JavaEndOfFile;

import java.util.Scanner;

public class Soluiton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String[] saveValuesString = new String[value];
        String myStrig;
        int i = 0;

        for (i = 0; i < saveValuesString.length; i++) {
            myStrig = scanner.nextLine();
            saveValuesString[i] = myStrig;
        }
        i = 0;

        for (String showValues : saveValuesString){
            i++;
            System.out.println(i + " " + showValues);
        }
    }
}

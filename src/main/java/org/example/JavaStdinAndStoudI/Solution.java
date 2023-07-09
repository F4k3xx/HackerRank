package org.example.JavaStdinAndStoudI;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] saveValues = new int[3];
        int myInt;

        for (int i = 0; i < saveValues.length; i++) {
            myInt = scanner.nextInt();
            saveValues[i] = myInt;
        }
        for (int showValues : saveValues){
            System.out.println(showValues);
        }
    }
}

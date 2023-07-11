package org.example.JavaEndOfFile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (scanner.hasNext()) {
            System.out.println(counter + " " + scanner.nextLine());
            counter++;
        }
    }
}

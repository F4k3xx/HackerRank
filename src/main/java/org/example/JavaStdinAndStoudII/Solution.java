package org.example.JavaStdinAndStoudII;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        double secondLine = scanner.nextDouble();
        scanner.nextLine();
        String thirdLine = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + thirdLine);
        System.out.println("Double: " + secondLine);
        System.out.println("Int: " + firstLine );
    }
}

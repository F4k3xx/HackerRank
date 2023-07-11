package org.example.JavaStaticInitializerBlock;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        int value = b * h;


        if (b > 0 && h > 0) {
            System.out.println(value);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}

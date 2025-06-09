package org.codelounge.basics;

import java.util.Scanner;

public class AddNumFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mode 1: Known number of inputs
        System.out.println("How many numbers will you enter?");
        int count = sc.nextInt();
        int total = 0;

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            int uInput = sc.nextInt();
            total += uInput;
        }
        System.out.println("Total using fixed input count: " + total);

        // Mode 2: Unknown number of inputs (use -1 to stop)
        int total1 = 0;
        System.out.println("Now enter numbers (enter -1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            total1 += num;
        }

        System.out.println("Total using unknown input count: " + total1);
    }
}

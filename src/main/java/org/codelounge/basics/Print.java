package org.codelounge.basics;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.println("@@Hello@@");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);

        if(num%2==0){
            System.out.println(num/2);
        }
        else {
            System.out.println(num/2.0);
        }

    }
}

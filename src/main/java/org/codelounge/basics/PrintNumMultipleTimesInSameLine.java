package org.codelounge.basics;

public class PrintNumMultipleTimesInSameLine {
    public static void main(String[] args) {
        int num=3;
        int times =4;

        for(;times>1;times--){
            System.out.print(num+" ");
        }
        System.out.println(num);// no space at last - 3 3 3 3


    }
}

package com.pb.kaplunivskyi.hw4;
import java.util.Scanner;

public class CapitalLetter {
   static void print(String in) {
       System.out.println(in);
    }
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       String in = scan.nextLine();
        print (String in);
       char[] charArr = in.toCharArray();
       System.out.println( in.toString ( charArr ) );
       String in2 = in.toUpperCase();
       System.out.println(in.toUpperCase());
    }
}
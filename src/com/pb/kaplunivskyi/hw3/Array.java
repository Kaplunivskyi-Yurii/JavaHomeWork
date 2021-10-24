package com.pb.kaplunivskyi.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Вставить элементы массива: ");

        for(int i = 0; i < 10; i++){
            array[i] = scan.nextInt();
        }
        System.out.print("Вывести на экран введенный массив:");
        for(int i = 0; i < 10; i++) {
            System.out.print ("" + array[i]);
        }
        int sum = 0;
        for (int i: array){
            sum = sum + array[i];
            System.out.println(" Cумма элементов массива равна:" + sum);}
            int counter = 0;
            for(int i = 0; i < 10; i++)
            {
                if(array[i] > 0)
                    counter += 1;
                System.out.println("кол-во положительных" + counter);
                break;
            }
            }
    }
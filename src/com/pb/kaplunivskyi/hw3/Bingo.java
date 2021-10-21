package com.pb.kaplunivskyi.hw3;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        playAgain = "";

        do{
            int TheNumber = (int) (Math.random() * 100 + 1);

            //System.out.println("rand TheNumber:"+ TheNumber);
            int guess = 0;
            int numberOfTries = 0;

            while (guess != TheNumber) {
                System.out.println("Введите число от 1 до 100: ");
                guess = scan.nextInt();
                numberOfTries++;
                numberOfTries = numberOfTries + 1;
                if (guess < TheNumber)
                    System.out.println(guess + " ваше число меньше. Попробуйте еще раз. ");
                else if (guess > TheNumber)
                    System.out.println(guess + " ваше число больше. Попробуйте еще раз. ");
                else
                    System.out.println(guess + " в точку. Вы выиграли!");
                //System.out.println("Вы ввели " + guess + ".");
            }
            System.out.println("Вы хотите продолжить игру(y/n)?");
            playAgain = scan.next();
            System.out.println("Вы сыграли " + numberOfTries + " раз.");
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Спасибо за игру. Досвидания.");

        scan.close();
    }
}

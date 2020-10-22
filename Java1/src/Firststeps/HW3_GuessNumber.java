package Firststeps;

import java.util.Random;
import java.util.Scanner;

public class HW3_GuessNumber {
//    1. Написать программу, которая загадывает случайное число от 0 до 9,
//     и пользователю дается 3 попытки угадать это число. При каждой попытке
//     компьютер должен сообщить больше ли указанное пользователем число чем
//     загаданное, или меньше. После победы или проигрыша выводится запрос –
//     «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    private static void task1() {
        byte x = 0;
        do {
            round();
            System.out.println("Повторить игру?");
            Scanner yn = new Scanner(System.in);
            x = yn.nextByte();
        }
        while (x == 1);
    }

    private static void round() {
        Random random = new Random();
        int r = random.nextInt(10);
        System.out.println("Нужно угадать число от 0 до 9, у вас три попытки");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка №" + (i+1));
            if (guess(r)) {
                System.out.println("Вы победили!");
                return;
            }
        }
        System.out.println("Вы проиграли");
    }
    private static boolean guess(int number) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == number){
            return true;
        }
        if (a > number){
            System.out.println("Ваше число больше загаданного");
        }
        else{
            System.out.println("Ваше число меньше загаданного");
        }
        return false;
    }
        public static void main (String[]args) {
            task1();

        }
}


package Firststeps;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    //1. Написать программу, которая загадывает случайное число от 0 до 9,
    // и пользователю дается 3 попытки угадать это число. При каждой попытке
    // компьютер должен сообщить больше ли указанное пользователем число чем
    // загаданное, или меньше. После победы или проигрыша выводится запрос –
    // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

//    private static void task1() {
//        byte x = 0;
//        do {
//            round();
//            System.out.println("Повторить игру?");
//            Scanner yn = new Scanner(System.in);
//            x = yn.nextByte();
//        }
//        while (x == 1);
//    }

//    private static void round() {
//        Random random = new Random();
//        int r = random.nextInt(10);
//        System.out.println("Нужно угадать число от 0 до 9, у вас три попытки");
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Попытка №" + (i+1));
//            if (guess(r)) {
//                System.out.println("Вы победили!");
//                return;
//            }
//        }
//        System.out.println("Вы проиграли");
//    }
//
//    private static boolean guess(int number) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a == number){
//            return true;
//        }
//        if (a > number){
//            System.out.println("Ваше число больше загаданного");
//        }
//        else{
//            System.out.println("Ваше число меньше загаданного");
//        }
//        return false;
//    }

    static String[] veg = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
            "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


    private static void task2() {
        if (guessWord()) {
            System.out.println("Вы выиграли!");

        }
        else {
            //opensLetters();
        }

    }


    private static boolean guessWord() {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
//        if (answer.equals(p))
//            return true;
        return false;
    }


//        private static void openLetters (int p) {
//          String s = "###############";
//          StringBuilder resh = new StringBuilder(s);
//          String str = veg[pos];
//          for (int i = 0; i < resh.length(); i++) {
//               if (str.charAt(i) == answer.charAt(i)) {
//               resh.setCharAt(i, str.charAt(i));
//               }
//               System.out.print(resh.charAt(i));
//           }
//    }


        public static void main (String[]args) {

            //дорабоать задачу из лекции
//        String s = "Предложение    один     Теперь   предложение     два    Предложение    три   ";
//        System.out.println(s);
//        String s1 = s.replaceAll(" +", " "); //"жадный плюс - все места где больше одного пробела заменяем на один пробел
//        StringBuilder s2 = new StringBuilder(s1);
//        for (int i = 1; i < s2.length(); i++) {
//            if (s2.charAt(i) >= 'А' && s2.charAt(i) < 'Я') { //здесь мы проставляем точки
//                s2.setCharAt(i - 1, '.');
//            }
//        }


//поставили пробелы после точек
            //for (int i = 1; i < s2.length(); i++) {
//            if (s2.charAt(i) == '.') {
//                s2.insert(i + 1, ' ');
            //}
            // }
//поставили точку в конце
            // s2.append('.');

//убрали пробел
//        String s3 = new String(s2);
//        String b = s3.replace(" .", ".");
//        System.out.println(b);

//1.
            //task1();

//2
            Random random = new Random();
            int pos = random.nextInt(veg.length);
            do {
                System.out.println("Угадайте овощ/фрукт");
                //System.out.println(veg[pos]);
                Scanner sc = new Scanner(System.in);
                String answer = sc.next();
                if (answer.equals(veg[pos])) {
                    System.out.println("Вы выиграли!");
                    return;
                } else {


                    //guessWord(pos);
                    String s = "###############";
                    StringBuilder resh = new StringBuilder(s);
                    String str = veg[pos];
                    int minStr = Math.min(str.length(), answer.length());
                    for (int i = 0; i < minStr; i++) {
                        if (str.charAt(i) == answer.charAt(i)) {
                            resh.setCharAt(i, str.charAt(i));
                        }

                    }
                    System.out.println(resh);
                }
            }while (true);
        }
}


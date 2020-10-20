package Firststeps;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassWork3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//       // String b = sc.nextLine();
//        String c = sc.next();
//       // System.out.println(a + " " + b + " " + " " + c);
//         System.out.println(a);
//         //System.out.println(b);
//        System.out.println(c);


//      форматированный ввод
//        int a = 100;
//        int b = 20;
//        int s = a + b;
//        String str3 = String.format("сумма %d + %d = %d", a, b, s);
//        System.out.println(str3);
//
//
//
//        String str = String.format("слово %s, число с запятой %f, целое %d, символ %c", "Java", 2.5f, 50, 'c');
//        System.out.println(str);

        //генератор псевдослучайных чисел
//
//        Random random = new Random();
//        System.out.println(random.nextInt(10)); //генерирует в диапазоне от 0 до 9
//        System.out.println(random.nextInt(20) -10); //генерирует в диапазоне от -9 до 9;
//        float f = random.nextFloat();
//        System.out.printf("%.1f",f); //обрезать дробное число до одного знака после запятой

//        //генератор цветов
//        Random random = new Random();
//        String[] color = {"Red", "Green", "Black"};
//        int pos = random.nextInt(color.length);
//        System.out.println(color[pos]);

        //генерируем числа в массив
        //System.out.println(Arrays.toString(getRandomTicket()));


        //сравнение строк
//        String str0 = "a";
//        String str1 = "bs";
//        String str3 = str0 + str1;
//        String str5 = "abs";
//        String str6 = "abs";
//        System.out.println(str5.equals(str3));

        //мутабельный тип данных (изменяемый) (обычная строка - имутабельный тип данных)
        // StringBuilder stringBuilder = new StringBuilder("builder");

        // }

        //генерируем числа в массив
//    private static int[] getRandomTicket() {
//        Random random = new Random();
//        int[] mass = new int[6];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = random.nextInt(50) + 1;
//        }
//        return mass;

        // вывести английский алфавит без использования массива
//        for (char a = 'a'; a <= 'z'; a++) {
//            System.out.print(a + " ");
//        }

        //приводим неудобночитаемую строку к человеческому виду
        String s = "Предложение    один     Теперь   предложение     два    Предложение    три   ";
        System.out.println(s);
        String s1 = s.replaceAll(" +", " "); //"жадный плюс - все места где больше одного пробела заменяем на один пробел
        StringBuilder s2 = new StringBuilder(s1);
        for (int i = 1; i < s2.length(); i++) {
            if (s2.charAt(i) >= 'А' && s2.charAt(i) < 'Я') { //здесь мы проставляем точки
                s2.setCharAt(i - 1, '.');
            };
        }


//поставили пробелы после точек
            for (int i = 1; i < s2.length(); i++) {
                if (s2.charAt(i) == '.') {
                    s2.insert(i + 1, ' ');
                }
            }
//поставили точку в конце
            s2.append('.');
            //убрали пробел
            String s3 = new String(s2);
            String b = s3.replace(" .",".");
            System.out.println(b);
        }

    }


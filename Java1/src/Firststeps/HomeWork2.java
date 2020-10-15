package Firststeps;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args){

        //1
        byte[] ar1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("исходный массив - " + Arrays.toString(ar1));
        replace(ar1);
        System.out.println("полученный массив - " + Arrays.toString(ar1));

        //2
        int[] ar2 = new int[8];
        fill(ar2);
        System.out.println(Arrays.toString(ar2));

        //3
        int[] ar3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("исходный массив - " + Arrays.toString(ar3));
        multiply(ar3);
        System.out.println("полученный массив - " + Arrays.toString(ar3));

        //4
        int[][] ar4 = new int[10][10];
        fillDiagonal(ar4);

        //5
        int[] ar5 = {4, -6, 10, 89, -100, 0, 2};
        System.out.println("В массиве " + Arrays.toString(ar5) + " max = " + searchMax(ar5) + ", а min = " + searchMin(ar5));

        //6
        int[] ar6 = {100, 2, 2, 1, 2, 2, 8, 1};
        System.out.println(checkBalance(ar6));

        //7
        int[] ar7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ar7));
        shifter(ar7, -3);
        System.out.println(Arrays.toString(ar7));
    }
//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
// и условия заменить 0 на 1, 1 на 0
    static void replace(byte[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) a[i] = 1;
                else {
                    a[i] = 0;
            }

        }
    }

//2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void fill(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3 ;
        }
    }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void multiply(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) a[i] = a[i] * 2;
        }
    }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void fillDiagonal(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((i == j) || (j == (a.length - 1 - i))) {
                    a[i][j] = 1;
                }else{
                    a[i][j] = 0;
                }
                    System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }

//5. ** Задать одномерный массив и найти в нем минимальный
// и максимальный элементы (без помощи интернета);
    static int searchMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        };return max;
    };

    static int searchMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        };return min;
    };

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.
    static boolean checkBalance(int[] a){
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sumL = sumL + a[i];
            for (int j = i + 1; j < a.length; j++) {
                sumR = sumR + a[j];
            }
            if (sumL == sumR){
                return true;}
            sumR = 0;
        }
        return false;
    }

//7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить
// все элементы массива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    static void shifter(int[]a, int value){
        boolean flag;
        if (value < 0) {
            flag = true;
            value = -value;
        }else{
            flag = false;
        }

        int lastIndex = a.length - 1;
        for (int i = 0; i < value ; i++) {
            int temp;
            if(flag){
                temp = a[0];
            }else{
                temp = a[lastIndex];
            }
            for (int j = 0; j < lastIndex; j++) {
                if(flag){
                    a[j] = a[j + 1];
                }else{
                    a[lastIndex - j] = a[lastIndex - j - 1];
                }
            }
            if(flag){
                a[lastIndex] = temp;
            }else{
                a[0] = temp;
            }
        }
    }
}


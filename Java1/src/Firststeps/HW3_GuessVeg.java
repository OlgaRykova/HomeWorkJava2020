package Firststeps;

import java.util.Random;
import java.util.Scanner;

public class HW3_GuessVeg {
    public static void main(String[] args){
         String[] veg = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
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
            }
            else {
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

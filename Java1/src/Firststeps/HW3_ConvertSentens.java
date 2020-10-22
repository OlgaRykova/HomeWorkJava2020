package Firststeps;

public class HW3_ConvertSentens {
    public static void main(String [] args){
    String s = "Предложение    один     Теперь   предложение     два    Предложение    три   ";
        System.out.println(s);
        String s1 = s.replaceAll(" +", " "); //"жадный плюс - все места где больше одного пробела заменяем на один пробел
        StringBuilder s2 = new StringBuilder(s1);
        for (int i = 1; i < s2.length(); i++) {
            if (s2.charAt(i) >= 'А' && s2.charAt(i) < 'Я') { //здесь мы проставляем точки
                s2.setCharAt(i - 1, '.');
            }
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
        String b = s3.replace(" .", ".");
        System.out.println(b);

    }
}

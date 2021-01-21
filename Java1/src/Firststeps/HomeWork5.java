package Firststeps;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee emp[] = new Employee[5];
        emp[0] = new Employee("Markina Irina Aleksandrovna", "hr manager", "123456789", 150000, 52, "ira@m.ru");
        emp[1] = new Employee("Pestova Ludmila Vladimirovna", "baker", "123456788", 160000, 33, "luda@j.com");
        emp[2] = new Employee("Kazaeva Tatiana Aleksandrovna", "seller", "123456787", 140000, 35, "Tana@y.ru");
        emp[3] = new Employee("Zotov Miron Vasiljevich", "loader", "123456786", 90000, 42, "mir@r.com");
        emp[4] = new Employee("Prozorova Katerina Vitalyevna", "accountant", "123456785", 130000, 34, "kat@t.g");

        for (int i = 0; i < emp.length; i++) {
            emp[i].print();
        }
        System.out.println("_________________________________________________________________________________________");
        System.out.println("employees over 40");
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > 40) {
                System.out.println(emp[i].getFullInfo());
            }
        }
    }
}

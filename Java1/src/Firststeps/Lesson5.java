package Firststeps;

public class Lesson5 {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("cat1", "red", 10);
//        Cat cat2 = new Cat("cat2", "black", 12);
//        Cat cat3 = new Cat("cat3", "green");
//        System.out.println("Сходили к ветеринару");
//        cat3.setAge(7);
//        cat1.info();
//        cat2.info();
//        cat3.info();
        Cat cat1 = new Cat();
        cat1.name = "wewe";
        Cat cat2 = new Cat();
        cat2.name = "sgsggs";

        Cat.TYPE = 2;

        cat1.info();
        cat2.info();
    }
}
//        Box box = new Box("box1", 10);
//        Tools tools = new Tools("hummer");
//        box.starTest(tools);
//    }
//}
//    class Box {
//        String name;
//        int weight;
//        public Box(String name, int weight){
//            this.name = name;
//            this.weight = weight;
//        }
//        void starTest(Tools tools){
//            tools.infoToolsAndBox(this);
//        }
//    }
//    class Tools {
//        public Tools(String tools){
//            this.tools = tools;
//        }
//        String tools;
//        void infoToolsAndBox(Box box){
//            System.out.println(tools + " " + box.name + " " + box.weight);
//        }
//    }


    class Cat {
    static int TYPE = 1;

        String name;
        private String color;
        private int age;

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public Cat(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public Cat() {
        }

        public void info() {
            System.out.println(name + " " + color + " " + age + " " + TYPE);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0){
                System.out.println("Такое невозможно");
            }
            else {
            this.age = age;
            }
        }
    }



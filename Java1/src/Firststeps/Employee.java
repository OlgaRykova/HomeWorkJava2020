package Firststeps;

public class Employee {
    private static final int CURRENT_YEAR = 2021;
    private String fullName;
    private String position;
    private String phoneNumber;
    private float salary;
    private int birthYear;
    private String email;

    public Employee(int age){
        this.birthYear = CURRENT_YEAR - age;
    }

    public Employee(String fullName, String position, String phoneNumber, int salary, int age, String email) {
        this(age);
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.email = email;
    }
    public void print() {
        System.out.println(fullName + " " + position + " " + phoneNumber + " " + salary + " " + getAge()  + " " + email);
    }
    String getFullInfo(){
        return this.fullName + " " +
                this.getAge() + " years old, " +
                this.position + ". Phone number: " +
                this.phoneNumber + ". Salary is " +
                this.getSalary() + " RUR. " + " email: " +
                this.email + " ";
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package Employee;

import java.util.Random;

import static java.lang.Math.round;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private double rate;

    public Employee(int id, String name, double salary, double rate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
    }

    public Employee() {
    }

    double zpCalc() {
        System.out.println(this.salary + " считаем зп менеджера " + this.rate + " все еще считаем зп ");

        return salary * rate;
    }

    @Override
    public String toString() {
        return ("Data Employee --> " + " Id:" + id + ", Name:" + name + ", Salary:" + salary + ", Rate: " + rate);
    }

}


class Developer extends Employee {
    private int id;
    private String name;
    private double salary;
    private double rate;
    private int codeLines;

    Developer(int id, String name, double salary, double rate, int codeLines) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
        this.codeLines = codeLines;
    }

    double zpCalc() {
        Random rand = new Random();
        int randomInt = 100 + rand.nextInt(901);
        return round(this.salary * this.rate * this.codeLines / randomInt);
    }

    @Override
    public String toString() {
        return ("Data Developer -->  Id:" + id + ", Name:" + name + ", Salary:" + salary + ", Rate: " + rate);
    }
}


class Manager extends Employee {
    private int id;
    private String name;
    private double salary;
    private double rate;
    private int projectsAmount;

    Manager(int id, String name, double salary, double rate, int projectsAmount) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
        this.projectsAmount = projectsAmount;
    }

    @Override
    public String toString() {
        return ("Data Manager --> Id:" + id + ", Name:" + name + ", Salary:" + salary + ", Rate: " + rate);
    }


    double zpCalc() {
        return round(salary * rate);
    }
}


class Test {
    public static void main(String[] args) {

        Developer john = new Developer(32, "john", 1000, 8.8, 500);
        System.out.println(john.toString());
        System.out.println("Money Developer calc, wages --> " + john.zpCalc());

        Manager bob = new Manager(11, "bob", 500, 4.4, 5);
        System.out.println(bob.toString());
        System.out.println("Money Manager calc, wages --> " + bob.zpCalc());


    }
}


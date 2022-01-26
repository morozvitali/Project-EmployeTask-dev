package Employee;

import java.util.Random;

import static java.lang.Math.round;

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

    double wagesCalculation() {
        Random rand = new Random();
        int randomInt = 100 + rand.nextInt(901);
        return round(this.salary * this.rate * this.codeLines / randomInt);
    }

    @Override
    public String toString() {
        return ("Data Developer -->  Id:" + id + ", Name:" + name + ", Salary:" + salary + ", Rate: " + rate);
    }
}

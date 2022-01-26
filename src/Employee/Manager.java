package Employee;

import static java.lang.Math.round;

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


    double wagesCalculation() {
        return round(salary * rate);
    }
}

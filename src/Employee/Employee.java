package Employee;

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

    double getSalary () {
        double retDouble = salary;
        return  retDouble;
    }
    double getRate () {
        double retDouble = rate;
        return  retDouble;
    }

    double wagesCalculation() {
        return salary * rate;
    }

    @Override
    public String toString() {
        return ("Data Employee --> " + " Id:" + id + ", Name:" + name + ", Salary:" + salary + ", Rate: " + rate);
    }
}
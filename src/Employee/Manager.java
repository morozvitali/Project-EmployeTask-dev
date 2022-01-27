package Employee;

class Manager extends Employee {
    private int projectsAmount;

    Manager(int id, String name, double salary, double rate, int projectsAmount) {
        super(id, name, salary, rate);
        this.projectsAmount = projectsAmount;
    }
}
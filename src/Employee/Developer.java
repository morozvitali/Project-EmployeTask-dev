package Employee;

import java.util.Random;
import static java.lang.Math.round;

class Developer extends Employee {
    private int codeLines;

    Developer(int id, String name, double salary, double rate, int codeLines) {
        super(id, name, salary, rate);
        this.codeLines = codeLines;
    }

    int getCodelines (){
        return codeLines;
    }

    public double wagesCalculation1() {
        Random rand = new Random();
        int randomInt = 100 + rand.nextInt(901);
        return round(getSalary() * getRate() * getCodelines() / randomInt);
    }
}
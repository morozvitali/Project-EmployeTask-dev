package Employee;

class Test {
    public static void main(String[] args) {

        Developer john = new Developer(32, "john", 1000, 8.8, 500);
        System.out.println(john.toString());
        System.out.println("Money Developer calculation, wages --> " + john.wagesCalculation1());

        Manager bob = new Manager(11, "bob", 500, 4.4, 5);
        System.out.println(bob.toString());
        System.out.println("Money Manager calculation, wages --> " + bob.wagesCalculation());
    }
}

package composite;

public class Staff extends Employee {

    public Staff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void showInfo() {
        System.out.println("- " + this.getName() + " : " + getSalary());
    }
}

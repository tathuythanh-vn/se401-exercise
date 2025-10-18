package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    };

    public void removeAll() {
        subordinates.clear();
    };

    @Override
    public double getSalary() {
        double total = this.salary;
        for (Employee e : subordinates) {
            total += e.getSalary();
        }
        return total;
    }

    @Override
    public void showInfo() {
        System.out.println("+ " + this.getName() + " : " + this.getSalary());
        for (Employee e : subordinates) {
            e.showInfo();
        }
    }
}

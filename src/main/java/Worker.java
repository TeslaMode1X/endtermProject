interface WorkerRelated {
    int getExperience();
    int getSalary();
}

public class Worker extends Employee implements WorkerRelated {
    private int experience;
    private int salary;

    public Worker(String name, int age, String department, int experience, int salary) {
        super(name, age, department);
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + getDepartment());
        System.out.println("Experience: " + getExperience());
        System.out.println("Salary: " + getSalary());
    }
}
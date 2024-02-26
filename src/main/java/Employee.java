public abstract class Employee {
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public abstract void displayInfo();

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    String getDepartment() {
        return department;
    }
}
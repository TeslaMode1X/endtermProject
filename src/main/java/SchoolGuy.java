interface SchoolGuyRelated {
    String getSchool();
    String getClassroom();
}

public class SchoolGuy extends Employee implements SchoolGuyRelated {
    private String school;
    private String classroom;

    public SchoolGuy(String name, int age, String department, String school, String classroom) {
        super(name, age, department);
        this.school = school;
        this.classroom = classroom;
    }

    @Override
    public String getSchool() {
        return school;
    }

    @Override
    public String getClassroom() {
        return classroom;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + getDepartment());
        System.out.println("School: " + getSchool());
        System.out.println("Classroom: " + getClassroom());
    }
}

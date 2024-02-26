interface studentRelated {
    String getUniversity();
    Integer getCourse();
    Integer gerGraduationYear();
}

public class Student extends Employee implements studentRelated {
    private String university;
    private Integer course;
    private int graduationYear;

    public Student(String name, int age, String department, String university, Integer course, int graduationYear) {
        super(name, age, department);
        this.university = university;
        this.course = course;
        this.graduationYear = graduationYear;
    }

    @Override
    public String getUniversity() {
        return university;
    }

    @Override
    public Integer getCourse() {
        return course;
    }

    @Override
    public Integer gerGraduationYear() {
        return graduationYear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + getDepartment());
        System.out.println("University: " + getUniversity());
        System.out.println("Course: " + getCourse());
        System.out.println("Graduation year: " + gerGraduationYear());
    }
}


interface InternRelated {
    String getInternshipProgram();
    String getMentor();
}

public class Intern extends Employee implements InternRelated {
    private String internshipProgram;
    private String mentor;

    public Intern(String name, int age, String department, String internshipProgram, String mentor) {
        super(name, age, department);
        this.internshipProgram = internshipProgram;
        this.mentor = mentor;
    }

    @Override
    public String getInternshipProgram() {
        return internshipProgram;
    }

    @Override
    public String getMentor() {
        return mentor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + getDepartment());
        System.out.println("Internship Program: " + getInternshipProgram());
        System.out.println("Mentor: " + getMentor());
    }
}


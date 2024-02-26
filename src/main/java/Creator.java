import java.sql.*;
import java.util.Scanner;

public class Creator {
    public static Student createNewStudent() {
        try (Connection con = DriverManager.getConnection(DBConnection.getConUrl(), DBConnection.getConUsername(), DBConnection.getConPassword());
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO Students (name, age, department, university, course, graduation_year) VALUES (?, ?, ?, ?, ?, ?)")) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter student's name: ");
            String name = input.nextLine();

            System.out.println("Enter student's age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("Enter department: ");
            String department = input.nextLine();

            System.out.println("Enter student's university: ");
            String university = input.nextLine();

            System.out.println("Enter student's course: ");
            int course = input.nextInt();
            input.nextLine();

            System.out.println("Enter student's graduation year: ");
            int graduationYear = input.nextInt();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, department);
            pstmt.setString(4, university);
            pstmt.setInt(5, course);
            pstmt.setInt(6, graduationYear);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student created successfully.");
                return new Student(name, age, department, university, course, graduationYear);
            } else {
                System.out.println("Failed to create student.");
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static Employee createNewSchoolGuy() {
        try (Connection con = DriverManager.getConnection(DBConnection.getConUrl(), DBConnection.getConUsername(), DBConnection.getConPassword());
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO schoolGuys (name, age, department, school, classroom) VALUES (?, ?, ?, ?, ?)")) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Enter your age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("Enter department: ");
            String department = input.nextLine();

            System.out.println("Enter your school: ");
            String school = input.nextLine();

            System.out.println("Enter your classroom: ");
            String classroom = input.nextLine();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, department);
            pstmt.setString(4, school);
            pstmt.setString(5, classroom);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("School guy created successfully.");
                return new SchoolGuy(name, age, department, school, classroom);
            } else {
                System.out.println("Failed to create school guy.");
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static Employee createNewIntern(Scanner sc) {
        try (Connection con = DriverManager.getConnection(DBConnection.getConUrl(), DBConnection.getConUsername(), DBConnection.getConPassword());
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO interns (name, age, department, internship_program, mentor) VALUES (?, ?, ?, ?, ?)")) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Enter your age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("Enter department: ");
            String department = input.nextLine();

            System.out.println("Enter your internship program: ");
            String int_prog = input.nextLine();

            System.out.println("Enter your mentor's name: ");
            String mentor_name = input.nextLine();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, department);
            pstmt.setString(4, int_prog);
            pstmt.setString(5, mentor_name);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Intern created successfully.");
                return new Intern(name, age, department, int_prog, mentor_name);
            } else {
                System.out.println("Failed to create intern.");
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Employee createNewWorker(Scanner sc) {
        try (Connection con = DriverManager.getConnection(DBConnection.getConUrl(), DBConnection.getConUsername(), DBConnection.getConPassword());
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO workers (name, age, department, experience, salary) VALUES (?, ?, ?, ?, ?)")) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Enter your age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("Enter department: ");
            String department = input.nextLine();

            System.out.println("Enter your experience: ");
            Integer experience = input.nextInt();

            System.out.println("Enter your salary: ");
            Integer salary = input.nextInt();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, department);
            pstmt.setInt(4, experience);
            pstmt.setInt(5, salary);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Worker created successfully.");
                return new Worker(name, age, department, experience, salary);
            } else {
                System.out.println("Failed to create worker.");
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}

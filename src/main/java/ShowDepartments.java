import java.sql.*;
import java.util.Scanner;

public class ShowDepartments {
    public static void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the category you want to check (schoolguys, workers, interns):");
        String category = sc.nextLine();

        System.out.println("Enter the department you want to check (HR, IT, Sales):");
        String dep = sc.nextLine();

        System.out.printf("\nList of %s with %s department:\n", category, dep);
        String tableName = category.toLowerCase();

        try (Connection con = DriverManager.getConnection(DBConnection.getConUrl(), DBConnection.getConUsername(), DBConnection.getConPassword());
             PreparedStatement pstmt = con.prepareStatement("SELECT * FROM " + tableName + " WHERE department = ?")) {

            pstmt.setString(1, dep);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    Integer age = rs.getInt("age");
                    String department = rs.getString("department");

                    System.out.printf("Name: %s, Age: %d, Department: %s%n", name, age, department);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

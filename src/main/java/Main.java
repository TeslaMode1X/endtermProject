import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        menu();
        int choice = sc.nextInt();
        while (choice > 0) {
            if (choice == 1) {
                employees.add(Creator.createNewStudent());
            } else if (choice == 2) {
                employees.add(Creator.createNewSchoolGuy());
            } else if (choice == 3) {
                employees.add(Creator.createNewIntern(sc));
            } else if (choice == 4) {
                employees.add(Creator.createNewWorker(sc));
            } else if (choice == 5) {
                ShowDepartments.show();
            } else {
                System.out.println("Invalid choice");
            }
            menu();
            choice = sc.nextInt();
        }
    }

    public static void menu() {
        System.out.println("Who are you?");
        System.out.println("1. Student");
        System.out.println("2. School guy");
        System.out.println("3. Intern");
        System.out.println("4. Worker");
        System.out.println("5. Check some tables for department");
        System.out.print("Enter your choice (0 to exit): ");
    }
}

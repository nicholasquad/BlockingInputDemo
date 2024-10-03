import java.util.Scanner;

public class SimpleBulletedInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "";
        String trash = "";
        double salary = 0;
        boolean doneSalary = false;

        do {

            System.out.println("Enter your salary: ");
            if (in.hasNextDouble()) {
                salary = in.nextDouble();
                in.nextLine(); // Clear the buffer
                System.out.println("You said your salary is " + salary);
                doneSalary = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Run the program and try again!");
            }
        } while (!doneSalary);
    }
}
import java.io.IOException;
import java.util.Scanner;

public class SentinalInput {
    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);
        String trash = "";
        String confirmYN = "";

        int numGrades = 0;
        int grade = 0;
        int totalGrade = 0;
        double aveGrade = 0;
        boolean doneGrades = false;

        do {

            System.out.println("Enter your next grade or -1 to quit: ");
            if (in.hasNextInt()) {


                grade = in.nextInt();
                in.nextLine(); // Clear the buffer

                if (grade == -1)  // Sentinal user is done with inputting
                {
                    aveGrade = (double) totalGrade / numGrades;
                    System.out.println("The average of " + numGrades + " grades is " + aveGrade);
                } else {
                    totalGrade += grade;
                    numGrades++;
                }

            }
                else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash);

            }
        } while (!doneGrades);

    }
}
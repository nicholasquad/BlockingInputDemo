import java.util.Scanner;

public class PromptedDataSet {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            String trash = "";
            String confirmYN = "";
            int numItems = 0;
            double itemPrice = 0;
            double totalPrice = 0;
            double avePrice = 0;
            boolean doneItems = false;

            do {

                System.out.println("Enter your next item: ");
                if (in.hasNextDouble()) {


                    itemPrice = in.nextDouble();
                    in.nextLine(); // Clear the buffer
                    numItems++; // numItems = numItems + 1
                    totalPrice += itemPrice; // totalPrice = totalPrice + itemPrice

                    System.out.println("Do you have another item [Y/N]: ");
                    confirmYN = in.nextLine();
                    confirmYN = confirmYN.toUpperCase();
                    if (confirmYN.equals("N")) {
                        doneItems = true;
                    }

                } else {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash);
                    System.out.println("Run the program and try again!");
                }
            } while (!doneItems);

            // compute the average
            avePrice = totalPrice / numItems;

            System.out.println("The average price of the " + numItems + doneItems + " items is " + avePrice);
        }


    }
}

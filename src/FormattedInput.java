import java.io.IOException;

public class FormattedInput
{
    public static void main(String args[])
    {
        int age = 15;
        double salary = 45000;

        for(int c = 0; <= 10; c++)
        System.out.printf("%-10s %10.2f%5d", "Nick", salary, age);
    }
}

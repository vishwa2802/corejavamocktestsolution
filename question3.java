import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();

        int sum = 0;
        int i = 0;

        System.out.println("Enter the numbers:");

        do {
            int number = scanner.nextInt();
            sum += number;
            i++;
        } while (i < count);

        double average = (double) sum / count;
        System.out.println("The average is: " + average);

        scanner.close();
    }
}

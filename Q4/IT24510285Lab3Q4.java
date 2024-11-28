import java.util.Scanner;

public class IT24510285Lab3Q4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        scanner.close();

        int firstDigit = number / 10000;
        int secondDigit = (number / 1000) % 10;
        int thirdDigit = (number / 100) % 10;
        int fourthDigit = (number / 10) % 10;
        int fifthDigit = number % 10;

        
        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
    }
}

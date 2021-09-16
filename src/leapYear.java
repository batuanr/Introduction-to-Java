import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                }
                else {
                    System.out.printf("%d is not leap year",year);
                }
            }
            else {
                System.out.printf("%d is a leap year", year);
            }
        }
        else {
            System.out.printf("%d is not leap year",year);
        }
    }
}

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang muon kiem tra");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("thang 2 co 28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " has 30 day");
                break;
            default:
                System.out.println("not available");
        }
    }
}

import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        int  vnd = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input USD: ");
        usd = scanner.nextInt();
       int change = usd*vnd;
        System.out.println(change + "VND");
    }
}

import java.util.Scanner;

public class Pt1 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.println("nhập a:");
        a = scanner.nextDouble();
        System.out.println("nhập b:");
        b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            System.out.println("Phương trình có nghiệm là: " + -b/a);
        }
    }
}

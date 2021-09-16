import java.util.Scanner;

public class BMi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input weight");
        double weight = scanner.nextDouble();
        System.out.println("input height");
        double height = scanner.nextDouble();
        double bmi = weight / (height*height);
        if (bmi < 18) {
            System.out.printf("%-12.2f%s",bmi, "gay");
        }
        else  {
            if (bmi < 25) {
                System.out.printf("%-12.2f%s",bmi, "binh thuong");
            }
            else {
                System.out.printf("%-12.2f%s",bmi, "beo");
            }
        }
    }
}

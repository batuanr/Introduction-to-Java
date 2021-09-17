import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        int number = scanner.nextInt();
        if (number < 13) {
            System.out.println(check13ToDown(number));
        }
        else {
            if (number < 100) {
                System.out.println(check100ToDown(number));
            }
            else {
                System.out.println(check999ToDown(number));
            }
        }
    }
    public static String check13ToDown(int n){
        switch(n){
            case 1:
                return "one";

            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
        }
        return "";
    }
    public static String check20ToDown(int n){
        switch(n){
            case 2:
                return "twen";
            case 3:
                return "thir";

            case 4:
                return "four";
            case 5:
                return "fif";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eigh";
            case 9:
                return "nine";
        }
        return null;
    }
    public  static String check100ToDown(int n){
        int a = (n -n%10)/10;
        int b = n%10;
        if (b==0){
            return check20ToDown(a)+"ty";
        }
        else{
            if (a < 2){
                return check20ToDown(b)+"teen";
            }return check20ToDown(a)+"ty-"+check13ToDown(b);
        }

    }
    public static String check999ToDown(int n){
        int a = (n -n%100)/100;
        int b = n%100;
        if (b<13){
            return check13ToDown(a)+" hundred "+check13ToDown(b);
        }
        return check13ToDown(a)+" hundred "+check100ToDown(b);
    }
}
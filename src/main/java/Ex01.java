import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    Random random = new Random();
    void question01() {
        float salary01 = 5240.5F;
        float salary02 = 10970.055F;
        int account01 = (int) salary01;
        int account02 = (int) salary02;
        System.out.println("account01 = " + account01);
        System.out.println("account02 = " + account02);
    }
    void question02() {
        int min = 0;
        int max = 100000;
        int a = min + random.nextInt(max - min +1);
        System.out.println("a = " + a);
        String b = String.valueOf(a);
        System.out.println("the digits of a = " + b.length());
        switch (b.length()){
            case 1:
                String d= "0000";

                System.out.println(d+b);
                break;
            case 2:
                String dd = "000";

                System.out.println(dd+b);
                break;
            case 3:
                String ddd = "00";

                System.out.println(ddd +b);
                break;
            case 4:
                String dddd = "0";

                System.out.println(dddd +b);
                break;
            default:
                System.out.println(b);
        }
    }
    void question03(){
        int min = 0;
        int max = 100000;
        int a = min + random.nextInt(max - min +1);
        System.out.println("a = " + a);
        String b = String.valueOf(a);

        System.out.println("the digits of a = " + b.length());
        switch (b.length()){
            case 1:
                String d= "0000" +b;

                System.out.println(d);
                System.out.println("last to digits = " + d.substring(3));
                break;
            case 2:
                String dd = "000"+ b;

                System.out.println(dd);
                System.out.println("last to digits = " + dd.substring(3));
                break;
            case 3:
                String ddd = "00" + b;

                System.out.println(ddd );
                System.out.println("last to digits = " + ddd.substring(3));
                break;
            case 4:
                String dddd = "0"+b;

                System.out.println(dddd);
                System.out.println("last to digits = " + dddd.substring(3));
                break;
            default:
                System.out.println(b);
                String value = b.substring(3);
                System.out.println("last to digits = " + value);
        }


    }
    void question04(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        String firstNumber = scanner.nextLine();
        System.out.println("Please enter the second number:");
        String secondNumber = scanner.nextLine();
        int a = Integer.parseInt(firstNumber);
        int b = Integer.parseInt(secondNumber);
        int c = a/b;
        String d = String.valueOf(c);
        System.out.println("value of the division is : " + c);
    }
}

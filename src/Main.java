import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("  @..@");
        System.out.println("(----)");
        System.out.println("(>__<)");
        System.out.println("^^~~^^");
        System.out.println("(\\__ /)");
*/
        // TODO review stackoverflow
        // TODO code snippets intellijidea

//        int a = 5, b = 2;
//        System.out.println((double) a / b);

//        Random random = new Random();
//
//        task1(random.nextInt() % 20 + 20);
//        task8();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input integer number: ");
//        task9(scanner.nextInt());

 /*       int day = 70;
        if (day > 0 && day <= 5) {
            System.out.println("Working day");
        } else if (day >= 6 && day <= 7) {
            System.out.println("Holiday");
        }

  */
    }

    private static void task1(double x) {
        double a;
        if (x > 0) {
            a = 3 * Math.pow(x, 1. / 3) - 7;
            System.out.println("1) X = " + x + ", a = " + a);
        } else {
            System.out.println("1) At x = " + x + " then No solutions");
        }
    }


    private static void task8() {
        double x = 8;
        double h;
        h = Math.cos(x / 2) + Math.sin(x / 4) + 3 * x / 6;
        System.out.println("h = " + h);
    }

    private static void task9(double x) {
        double y;

//        y = Math.abs(5 * x - 3 / (x * x) + 6 + 7 * x * x * x - 12);
//        System.out.println("At x = " + x + ", y = " + y);

        if (x == 0) {
            System.out.println("No solutions at X = 0!");
        } else {
            y = Math.abs(5 * x - 3 / (x * x) + 6 + 7 * x * x * x - 12);
            System.out.println("At x = " + x + ", y = " + y);
        }
    }
}
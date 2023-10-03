package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//  TASK1

        System.out.println(InputReturn());
    }

    public static float InputReturn() {
        float input = 0;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите дробное число:");
            try {
                input = scan.nextFloat();
                break;
            } catch (RuntimeException e) {
                System.out.println("Допустим ввод только дробных чисел");
            }
        }
        return input;
    }
}
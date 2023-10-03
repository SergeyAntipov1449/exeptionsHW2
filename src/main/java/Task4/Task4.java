package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(stringIsNotBlank());
    }

    public static String stringIsNotBlank() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scan.nextLine();
        if (input.isBlank()) {
            throw new RuntimeException("Недопустим ввод пустой строки");
        }
        return input;
    }
}
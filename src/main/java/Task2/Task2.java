package Task2;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {456, 48, 19, 13, 99, 1234, 479, 1254, 22, 255};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}

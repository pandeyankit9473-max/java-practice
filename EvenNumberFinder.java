import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        System.out.println("Enter elements:");
        for (int index = 0; index < size; index++) {
            numbers.add(input.nextInt());
        }

        System.out.println("Even numbers are:");

        for (int value : numbers) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }

        input.close();
    }
}
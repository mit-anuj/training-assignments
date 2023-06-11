import java.util.Scanner;

public class largestElementOfArray {
    public static int findHighestElement(int[] arr) {
        int highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int count = scanner.nextInt();

        int[] arr = new int[count];

        System.out.println("Enter the elements:");

        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int highestElement = findHighestElement(arr);
        System.out.println("Highest element: " + highestElement);
     scanner.close();
    }
}

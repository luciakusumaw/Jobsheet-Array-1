import java.util.Scanner;
public class linearSearch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arrayInt[i] == key) {
                System.out.println("Key found at index position: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Key not found.");
        }
    }
}


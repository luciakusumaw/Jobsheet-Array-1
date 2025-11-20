import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] orderName = new String[n];
        double[] orderPrice = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of order-" + i + ": ");
            orderName[i] = sc.nextLine();

            System.out.print("Enter price of order-" + i + ": ");
            orderPrice[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        System.out.println("\n===== List of Orders =====");
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(orderName[i] + " - Rp " + orderPrice[i]);
            totalCost += orderPrice[i];
        }
        System.out.println("---------------------------");
        System.out.println("Total cost: Rp " + totalCost);
    }
}



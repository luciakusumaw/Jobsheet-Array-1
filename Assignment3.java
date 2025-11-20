import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu [] = new String[] {"Fried Rice", "Noodles", "Spaghetti", "Donut", "Mineral Water"};
        System.out.print("Enter the menu item you want to search: ");
        String key = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                found = true;
                break;
            } 
        }

         if (found) {
            System.out.println("The item \"" + key + "\" is available on the menu.");
        } else {
            System.out.println("The item \"" + key + "\" is not on the menu.");
        }
    }
}

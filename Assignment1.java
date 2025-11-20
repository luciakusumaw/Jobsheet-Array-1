import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        double score[] = new double[n];
        double total=0;
        for (int i =0; i<n; i++) {
            System.out.print("Enter the score of student-" + i + ": ");
            score[i] = sc.nextDouble();
            total += score[i];
        }
        double average = total / score.length;
        System.out.println("The average score is: " + average);

        System.out.println("All grades entered:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student-" + i + ": " + score[i]);
        }
        double highest = score[0];
        double lowest = score[0];
        for (int i = 0; i < n; i++) {
            if (score[i] > highest) {
                highest = score[i];
            }
            if (score[i] < lowest) {
                lowest = score[i];
            }
        }
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}

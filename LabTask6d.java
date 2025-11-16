import java.util.Scanner;
public class LabTask6d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.print("Enter your choice (1–5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Solid rectangle
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Left aligned triangle
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Right aligned triangle (your desired output)
                    for (int i = 1; i <= 5; i++) {
                        for (int s = 1; s <= 5 - i; s++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    // Pyramid
                    for (int i = 1; i <= 5; i++) {
                        for (int s = 1; s <= 5 - i; s++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    // Number pyramid
                    for (int i = 1; i <= 5; i++) {
                        for (int s = 1; s <= 5 - i; s++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.print("Do you want to try again? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Program ended.");
        sc.close();
    }
}

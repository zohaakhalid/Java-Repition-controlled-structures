import java.util.Scanner;

public class Lab6e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year (e.g. 2025): ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

        for (int month = 1; month <= 12; month++) {
            printMonth(year, month, firstDay);
            firstDay = (firstDay + getNumberOfDaysInMonth(year, month)) % 7;
        }

        input.close();
    }

    public static void printMonth(int year, int month, int startDay) {
        System.out.println();
        printMonthTitle(year, month);
        printMonthBody(year, month, startDay);
    }

    public static void printMonthTitle(int year, int month) {
        String monthName = getMonthName(month);
        System.out.println("        " + monthName + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month, int startDay) {
        int daysInMonth = getNumberOfDaysInMonth(year, month);

        
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println("\n");
    }

    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static boolean isLeapYear(int year) {
      
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
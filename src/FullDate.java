import java.util.Scanner;

public class FullDate {
    public static void main(String[] args) {
        /*
        Scanner will store user input
        Ask user for month number (__), day (__), and year (__)
        I have to change month number to month string (conditionals)
        i have to change year (20) to look like 2020*/

        Scanner keybd = new Scanner(System.in);
        String monthName = "";

        System.out.println("Please enter the month in number (1-12): ");
        int month = keybd.nextInt();
        System.out.println("Please enter today's date: ");
        int day = keybd.nextInt();
        keybd.nextLine();
        System.out.println("Please enter the last 2 digits of the year (20XX): ");
        String year = keybd.nextLine();

        switch(month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("You did not enter a valid month.");
                monthName = "unknown";
                break;
        }
        System.out.println("Full date: " + monthName + " " + day + ", 20" + year + ".");
    }
}

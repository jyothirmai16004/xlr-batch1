import java.util.Scanner;

public class Demo09 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input values
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        
        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();
        
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();
        
        // Convert years, months, and days to minutes
        long totalMinutes = convertToMinutes(years, months, days);
        
        // Output the result
        System.out.println("Total time in minutes: " + totalMinutes);
        
        scanner.close();
    }
    
    
    public static long convertToMinutes(int years, int months, int days) {
        // Average days in a year and month (non-leap year, not accounting for exact month lengths)
        final int MINUTES_IN_A_DAY = 1440; // 24 hours * 60 minutes
        final int AVERAGE_DAYS_IN_A_YEAR = 365; 
        final int AVERAGE_DAYS_IN_A_MONTH = 30; // Approximation
        
        // Convert years and months to days
        long totalDays = years * AVERAGE_DAYS_IN_A_YEAR 
                         + months * AVERAGE_DAYS_IN_A_MONTH 
                         + days;
        
        // Convert days to minutes
        return totalDays * MINUTES_IN_A_DAY;
    }
}

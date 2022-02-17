package designprinciples.kiss;

import java.util.List;

public class Kiss {

    /*
     * - keep it simple and stupid
     * - easily to read from anyone
     * - keep methods small
     * - break up long conditions
     * - break up long code
     * - can be easier to change
     * - readable
     * - maintainable
     * - self-descriptive
     *
    */
    public static void main(String[] args) {
        System.out.println(Month.getMonthName(1));
    }
}

class Month {

    private static final List<String> MONTHS = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

    // not using KISS
    public static String getMonth(Integer month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException("Month must be in range 1 to 12");
        }
    }

    // using KISS

    public static String getMonthName(Integer monthNumber) {
        if (!isValidMonth(monthNumber)) throw new IllegalArgumentException("Month must be in range 1 to 12");
        return MONTHS.get(monthNumber - 1);
    }

    private static Boolean isValidMonth(Integer monthNumber) {
        return (monthNumber >= 1) && (monthNumber <= 12);
    }
}

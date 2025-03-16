public class Example {

    /**
     * Minimum number of months required to save for the down payment using the Math class
     * when the minimum down payment percentage is 20%
     * If the number of months is off by one, consider what it means to "Minimum number of months'
     * ASSUME: User enters valid inputs
     * EX: Percent Saved always a value between 0.00 and 1.00
     * Be careful about values representing annual versus monthly amounts
     * @param salary starting salary as an int
     * @param saveRate percent of salary to be saved as a double
     * @param houseCost cost of the house and an int
     * @return min number of months required to save for the down payment
     */
    public static int calcDownPay(int salary, double saveRate, int houseCost) {
        final double DOWN_PAYMENT_PERCENTAGE = 0.2; // 20% down payment
        double downPayment = houseCost * DOWN_PAYMENT_PERCENTAGE;

        double monthlySalary = salary / 12.0;
        double monthlySavings = monthlySalary * saveRate;

        double totalSavings = 0;
        int months = 0;

        while (totalSavings < downPayment) {
            totalSavings += monthlySavings;
            months++;
        }

        return months;
    }

    public static void main(String[] args) {
        int startingSalary = 60_000;
        double saveRate = 0.15; // 15% of salary saved
        int houseCost = 300_000;

        int months = calcDownPay(startingSalary, saveRate, houseCost);
        System.out.println("Minimum months to save: " + months);
    }
}

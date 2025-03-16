import java.util.Arrays;

public class CountIntegersExample {

    public static int[] countIntegers(int n) {
        int[] digitCounts = new int[10]; // Array to store digit counts (indices 0-9)

        String numStr = Integer.toString(Math.abs(n)); // Convert number to string representation

        for (char c : numStr.toCharArray()) { // Iterate over each character in the string
            int digit = Character.getNumericValue(c); // Convert character to integer digit
            digitCounts[digit]++; // Increment the corresponding index in the array
        }

        return digitCounts;
    }

    public static int[] countIntegers2(int n) {
        int[] digitCounts = new int[10]; // Array to store digit counts (indices 0-9)

        String numStr = Integer.toString(n); // Convert number to string representation

        int count = 0;
        int position = 0;
        char targetChar = '0';
        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == targetChar) {
                    count++;
                }
            }
            digitCounts[position] = count;
            count = 0;
            position++;
            targetChar = (char)( targetChar + 1);
        }
        return digitCounts;
    }
    public static int[] countIntegers3(int n) {
        int[] digitCounts = new int[10]; // Array to store digit counts (indices 0-9)

        String numStr = Integer.toString(n); // Convert number to string representation

        int count = 0;
        int position = 0;

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == Character.forDigit(position, 10)) {
                    count++;
                }
            }
            digitCounts[position] = count;
            count = 0;
            position++;
        }
        return digitCounts;
    }

    public static void main(String[] args) {
        int number = 1023581321;
        int[] result = countIntegers(number);
        int[] result2 = countIntegers2(number);
        int[] result3 = countIntegers3(number);

        System.out.println("Digit frequencies 1: " + Arrays.toString(result));
        System.out.println("Digit frequencies 2: " + Arrays.toString(result2));
        System.out.println("Digit frequencies 3: " + Arrays.toString(result3));

    }
}

import java.util.HashMap;
import java.util.Map;

public class romanToNumber {

    public static int romanToInt(String s) {
        // Create a map to store Roman numerals and their corresponding values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Example Roman numeral
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);
    }
}
import java.util.*;

public class wordsToNumbers {
    private static final Map<String, Integer> map = new HashMap<>();
    static {
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen", 16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);
        map.put("hundred", 100);
        map.put("thousand", 1000);
        map.put("million", 1000000);
    }

    public static int wordsToNumber(String words) {
        int total = 0;       // Final result
        int current = 0;     // Holds the temporary sum before applying multipliers

        for (String word : words.toLowerCase().split("\\s+")) {
            if (map.containsKey(word)) {
                int value = map.get(word);

                if (value == 100) {
                    current *= 100; // Multiply current by 100 (e.g., "three hundred")
                } else if (value >= 1000) {
                    total += current * value; // Apply multipliers like thousand/million
                    current = 0; // Reset after applying a large unit
                } else {
                    current += value; // Add regular numbers
                }
            }
        }
        return total + current; // Ensure remaining value is added
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(wordsToNumber(str)); 
        sc.close();
    }
}

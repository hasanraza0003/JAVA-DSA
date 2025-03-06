import java.util.Scanner;

public class numberToWords {
        private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen"};
        private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
        public static String convert(int num) {
            if (num == 0) return "Zero";
            if (num < 10) return units[num];
            if (num < 20) return teens[num - 10];
            if (num < 100) return tens[num / 10] + (num % 10 != 0 ? " " + units[num % 10] : "");
            if (num < 1000) return units[num / 100] + " Hundred " + (num % 100 != 0 ? convert(num % 100) : "");
            return "Number too large to convert!";
        }
    
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            System.out.println(convert(num)); 
            sc.close();

        }
    }
    
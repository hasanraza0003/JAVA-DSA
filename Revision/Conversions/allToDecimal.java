import java.util.Scanner;

public class allToDecimal{
        public static void main(String[] args) {
            
            System.out.println("Enter The String To Convert -> ");
            Scanner sc=new Scanner(System.in);
            String str = sc.next();
        
    
            System.out.println("Binary to Decimal: " + binaryToDecimal(str));
            System.out.println("Octal to Decimal: " + octalToDecimal(str));
            System.out.println("Hexadecimal to Decimal: " + hexToDecimal(str));

            sc.close();
        }
    
        // Binary to Decimal (Custom Logic)
        public static int binaryToDecimal(String binary) {

            int decimal = 0, power = 0;

            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, power); //here everytime is one so it is ok to not multiply to * 1
                }
                power++;
            }
            return decimal;
        }
    
        // Octal to Decimal (Custom Logic)
        public static int octalToDecimal(String octal) {

            int decimal = 0, power = 0;

            for (int i = octal.length() - 1; i >= 0; i--) {
                decimal += (octal.charAt(i) - '0') * Math.pow(8, power);
                power++;
            }
            return decimal;
        }
    
        // Hexadecimal to Decimal (Custom Logic)
        public static int hexToDecimal(String hex) {

            String hexChars = "0123456789ABCDEF";
            hex = hex.toUpperCase();

            int decimal = 0;
            for (int i = 0; i < hex.length(); i++) {
                int value = hexChars.indexOf(hex.charAt(i));
                decimal = decimal * 16 + value;
            }
            return decimal;
        }
    }
    
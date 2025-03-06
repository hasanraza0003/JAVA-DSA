import java.util.Scanner;

public class decimalToAll{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter The number -> ");
            int decimal = sc.nextInt();

            System.out.println("Decimal: " + decimal);
            System.out.println("Binary: " + decimalToBinary(decimal));
            System.out.println("Octal: " + decimalToOctal(decimal));
            System.out.println("Hexadecimal: " + decimalToHex(decimal));

            sc.close();
        }
    
        // Decimal to Binary (Custom Logic)
        public static String decimalToBinary(int decimal) {

            StringBuilder binary = new StringBuilder();

            while (decimal > 0) {
                binary.insert(0, decimal % 2);
                decimal /= 2;
            }
            return binary.length() > 0 ? binary.toString() : "0";
        }
    
        // Decimal to Octal (Custom Logic)
        public static String decimalToOctal(int decimal) {

            StringBuilder octal = new StringBuilder();

            while (decimal > 0) {
                octal.insert(0, decimal % 8);
                decimal /= 8;
            }
            return octal.length() > 0 ? octal.toString() : "0";
        }
    
        // Decimal to Hexadecimal (Custom Logic)
        public static String decimalToHex(int decimal) {

            String hexChars = "0123456789ABCDEF";
            StringBuilder hex = new StringBuilder();

            while (decimal > 0) {
                int remainder = decimal % 16;
                hex.insert(0, hexChars.charAt(remainder));
                decimal /= 16;
            }
            return hex.length() > 0 ? hex.toString() : "0";
        }
    }
    
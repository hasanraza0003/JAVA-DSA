import java.util.Scanner;

public class secureLockSystem {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                sc.nextLine();

                while (t-- > 0) {
                        System.out.println("Enter The Pin -> ");
                        String str = sc.nextLine();

                        checkPin(str);
                }

                sc.close();
        }

        public static void checkPin(String str) {

                int n = str.length();
                int sum = 0;

                for (int i = 0; i < n; i++) {
                        int num = Character.getNumericValue(str.charAt(i));
                        sum += num;
                }

                if (sum % 4 == 0) {
                        System.out.println("OPEN");
                } else {
                        System.out.println("LOCKED");
                }
        }

}

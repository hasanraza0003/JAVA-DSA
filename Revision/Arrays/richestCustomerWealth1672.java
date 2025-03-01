
import java.util.Scanner;

public class richestCustomerWealth1672 {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Number of Rows -> ");
                int i=sc.nextInt();
                System.out.println("Enter the Number of Cols -> ");
                int j=sc.nextInt();
                System.out.println("Enter the Elements of Array Row Wise -> ");

                int arr[][]=new int[i][j];
                for(int x=0;x<i;x++){
                        for(int y=0;y<j;y++){
                                arr[x][y]=sc.nextInt();
                        }
                }
                System.out.println("The Maximum Wealth is -> "+ maximumWealth(arr));
                sc.close();
        }

        public static int maximumWealth(int[][] accounts) {
                int max = Integer.MIN_VALUE;

                for (int i = 0; i < accounts.length; i++) {
                        int ans = 0;
                        for (int j = 0; j < accounts[i].length; j++) {
                                ans += accounts[i][j];
                        }
                        if (ans > max) {
                                max = ans;
                        }
                }
                return max;
        }

}

import java.util.*;

public class placeZeroToEnd {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Size Of Array -> ");
                int n = sc.nextInt();

                System.out.println("Enter The Elements Of Array -> ");
                int arr[] = new int[n];

                for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                }
                movesZero(arr, n);
                for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                }

                sc.close();
        }

        public static void movesZero(int arr[], int n) {
                int x = 0;

                for (int i = 0; i < n; i++) {
                        if (arr[i] != 0) {
                                int temp = arr[i];
                                arr[i] = arr[x];
                                arr[x] = temp;
                                x++;
                        }
                }
        }
}
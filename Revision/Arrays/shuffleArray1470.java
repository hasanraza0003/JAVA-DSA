package Arrays;

import java.util.Scanner;

public class shuffleArray1470 {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter The Size Of Array -> ");
                int n=sc.nextInt();
        
                int arr[]=new int[n];
                System.out.println("Enter the elements of Array -> ");
                for (int i = 0; i < n; i++) {
                        arr[i]=sc.nextInt();
                }
                
                System.out.println("The Shuffled Array is -> ");
                int ans[] = shuffle(arr, n/2);
                for(int i=0;i<n;i++){
                        System.out.print(ans[i]+" ");
                }

                sc.close();
        }

        public static int[] shuffle(int[] nums, int n) {
                int[] ans = new int[2 * n];
                for (int i = 0; i < n; i++) {
                        ans[2 * i] = nums[i];
                        ans[2 * i + 1] = nums[n + i];
                }
                return ans;
        }
}

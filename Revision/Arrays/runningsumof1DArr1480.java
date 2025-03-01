package Arrays;
import java.util.Scanner;

public class runningsumof1DArr1480 {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter The Size Of Array -> ");
                int n=sc.nextInt();
                System.out.println("Enter The Elements Of Array -> ");
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }

                runningSum(arr);
                
                for(int j=0;j<n;j++){
                        System.out.print(arr[j] + " ");
                }
                sc.close();
        }

        public static int[] runningSum(int[] nums) {
                int sum=0;
                for(int i=0; i<nums.length; i++){
                    sum += nums[i];
                    nums[i]=sum;
                }
                return nums;
            }
            
}

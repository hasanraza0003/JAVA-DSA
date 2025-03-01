
import java.util.*;

public class buildArray1920 {
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the size of Array");
             int n=sc.nextInt();
             
             int arr[]=new int[n];
             for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
             }
             buildArray(arr);
             for(int j=0;j<n;j++){
                System.out.print(arr[j] +" ");
             }
             sc.close();
        }
        public static int[] buildArray(int[] nums) {
                // Method 1 =>
                // Time-> O(n) Space -> O(n)
                // int ans[]=new int[nums.length];
                // for(int i=0;i<nums.length;i++){
                //    ans[i]=nums[nums[i]];
                // }
                // return ans;
        
                // Method 2 =>
                // Time-> O(2n) Space -> O(1)
                int n=nums.length;
        
                for(int i=0;i<n;i++){
                    nums[i]=nums[i] + (nums[nums[i]]%n)*n;    
                }
                for(int i=0;i<n;i++){
                    nums[i]=nums[i]/n;
                }
                return nums;
            }
}

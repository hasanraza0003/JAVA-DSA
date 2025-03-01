package Arrays;

import java.util.Scanner;

public class numbersOfGoodPairs1512 {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Size Of Array -> ");
                int n=sc.nextInt();

                int arr[]=new int[n];
                System.out.println("Enter the Elements Of Array -> ");
                for (int i = 0; i < n; i++) {
                    arr[i]=sc.nextInt();
                }
                System.out.println("The Number Of Good Pair in Array is -> "+ numIdenticalPairs(arr));
                sc.close();
            }
        public static int numIdenticalPairs(int[] nums) {
                int n=nums.length;
                int count=0;
        
                for(int i=0;i<n;i++){
                    for(int j=i;j<n;j++){
                        if(nums[i]==nums[j] && i<j){
                            count++;
                        }
                    }
                }
        
                return count;
            }
}

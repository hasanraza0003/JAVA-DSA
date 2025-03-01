

import java.util.Scanner;

public class concatarray1929 {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                
                System.out.println("Enter Size of Array -> ");
                int n=sc.nextInt();
                System.out.println("Enter Elements of Array -> ");

                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }

                int ans[] = getConcatenation(arr);
                for(int j=0;j<ans.length;j++){
                        System.out.print(ans[j]+" ");
                }
        sc.close();
        }
        public static int[] getConcatenation(int[] nums) {
                int n=nums.length;
        
                int ans[]=new int[2*n];
                for(int i=0;i<n;i++){
                    ans[i]=nums[i];
                    ans[i+n]=nums[i];
                }
                return ans;
            }
}

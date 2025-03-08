import java.util.Scanner;

class smallerThanCurrent1365{
        public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter The Size Of Array");
                int n=sc.nextInt();
                
                System.out.println("Enter The Elements Of Array");
                int[] arr=new int[n];
                for (int i = 0; i < n; i++) {
                        arr[i]=sc.nextInt();
                }

                int[] ans=smallerNumbersThanCurrent(arr);
                for (int i = 0; i < n; i++) {
                        System.out.print(ans[i]+" ");
                }
                sc.close();
        }

        // Brute Force 
        public static int[] smallerNumbersThanCurrent(int[] nums) {
                int n=nums.length;
                int [] ans=new int[n];
        
                for(int i=0;i<n;i++){
                    int count=0;
                    for(int j=0;j<n;j++){
                        if(j==i) continue;
                        
                        if(nums[j]<nums[i]){
                            count++;
                        }
                    }
                    ans[i]=count;
                }
                return ans;
            }

        // Optimized Approach -> HashMap 
}
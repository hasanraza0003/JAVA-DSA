package Subarray;
import java.util.*;

public class targetIndex {
       public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Target Value -> ");
        int target=sc.nextInt();

        System.out.println("Enter The Array Size -> ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
        }
        
        int[] ans=found(arr,n,target);
        for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i] + " ");
        }
        sc.close();
       }
       
       public static int[] found(int[] arr,int n,int target){
                for(int i=0;i<n;i++){
                        int sum=0;
                        for (int j = i; j < n; j++) {
                                sum += arr[j];
                                if(sum==target){
                                        return new int[]{i,j};
                                }
                        }
                }
                return new int[]{-1,-1};
       }
       
}

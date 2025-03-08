package Subarray;

import java.util.Scanner;

public class maxKsizeWindow {

        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter The Size Of Array -> ");

                int n=sc.nextInt();
                
                System.out.println("Enter The Window Size -> ");
                int k=sc.nextInt();

                System.out.println("Enter The Elements Of Array -> ");
                
                int arr[]=new int[n];
                for (int i = 0; i < n; i++) {
                        arr[i]=sc.nextInt();
                }
                
                int[] ans=maxInWindowK(arr,n,k);
                
                for (int i = 0; i < ans.length; i++) {
                        System.out.print(ans[i] + " ");;
                }
                sc.close();

        }

        public static int[] maxInWindowK(int[] arr,int n,int k){
                int ans[]=new int[n-k+1];

                for(int i=0;i<n-k+1;i++){
                        int maxi=Integer.MIN_VALUE;
                        for (int j = i; j < i+k; j++) {
                                if(arr[j]> maxi){
                                        maxi=arr[j];
                                }
                        }
                        ans[i]=maxi;
                }
                return ans;
        }
        
}
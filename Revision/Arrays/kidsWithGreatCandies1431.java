package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kidsWithGreatCandies1431 {

        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter The Number Of Kids -> ");
                int n=sc.nextInt();
                
                System.out.println("Enter The Number Of Extra Candies -> ");
                int candies=sc.nextInt();
                
                int arr[]=new int[n];
                System.out.println("Enter The Number Of Candies Kids have -> ");
                for (int i = 0; i < n; i++) {
                        arr[i]=sc.nextInt();        
                }

                List<Boolean> anss=new ArrayList<>(kidsWithCandies(arr, candies));
                for (int i = 0; i<anss.size(); i++) {
                        System.out.print(anss.get(i) +" ");
                }

                sc.close();
        }

        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        
        List<Boolean> ans=new ArrayList<>();

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(candies[i]>maxi){
                maxi=candies[i];
            }
        }

        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies) >= maxi){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }

        return ans;
    }
}
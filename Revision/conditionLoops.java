import java.util.*;

public class conditionLoops{
        public static Scanner sc=new Scanner(System.in);
        public static void main(String[] args) {

                // Basics 
                // int n=sc.nextInt();
                // int ans=subtractProductAndSum(n);
                // System.out.println(ans);

                // int num=sc.nextInt();
                // factorsOfNum(num);

                // printSumofAll();
                // maxOfAll();

                // Intermediate Level 
                
                // System.out.println("Enter The Number You Want Factorial of Num ->");
                // int num=sc.nextInt();
                // fact(num);

                System.out.println("Enter The String You Want to Reverse -> ");
                String str=sc.next();
                reverseStr1(str);
                reverseStr2(str);
                reverseStr3(str);


                sc.close();
        }

        // From Q-22
        // public static int subtractProductAndSum(int n) {
        //         int prod=1,sum=0;
        //         while(n!=0){
        //             int rem=n%10;
        //             prod *= rem;
        //             sum += rem;
        //             n=n/10;
        //         }
        //         return prod-sum;
        //     }

        // public static void factorsOfNum(int num){
        //         for(int i=1;i<=num;i++){
        //                 if(num%i==0){
        //                         System.out.print(i+" ");
        //                 }
        //         }
        // }

        // public static void printSumofAll(){
        //         int sum=0;
        //         while(sc.hasNextInt()){
        //                 int n=sc.nextInt();
        //                 if(n==0){
        //                         break;
        //                 }
        //                 sum+=n;
        //         }
        //         System.out.println(sum);
        // }

        // public static void maxOfAll(){
        //         int max=Integer.MIN_VALUE;
        //         while(sc.hasNextInt()){
        //                 int num=sc.nextInt();
        //                 if(num==0){
        //                         break;
        //                 }
        //                 if(num>max){
        //                         max=num;
        //                 }
        //         }
        //         System.out.println(max);
        // }

        // public static void fact(int num){
        //         int fact=1;
        //         if( num<0 ) System.out.println("Enter The Positive Number..");
        //         for(int i=num;i>0;i--){
        //                 fact *= i;
        //         }
        //         System.out.println("The Factorial Of Number is  -> "+ fact);
        // }

        public static void reverseStr1(String str){
                String rev=new StringBuilder(str).reverse().toString();
                System.out.println("The Reverse String is -> "+ rev);
        }        

        public static void reverseStr2(String str){
                char[] charArr=str.toCharArray();
                int left=0,right=charArr.length-1;
                while(left<right){
                        char temp=charArr[left];
                        charArr[left]=charArr[right];
                        charArr[right]=temp;

                        left++;
                        right--;
                }
                System.out.println("The Reverse String is -> " + new String(charArr));
        }
        
        public static void reverseStr3(String str){    
                String rev="";
                for(int i=str.length()-1;i>=0;i--){
                        rev += str.charAt(i);
                }
                System.out.println("The Reverse String is -> " + rev);
        }

}
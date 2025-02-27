import java.util.*;

public class first {
        public static void main(String[] args) {
                
                Scanner sc=new Scanner(System.in);

                // int num=sc.nextInt();
                // evenOrOdd(num);

                // String name=sc.nextLine();
                // greet(name);
                
                // System.out.println("Enter The Principal Amount ->");
                // int principal=sc.nextInt();
                // System.out.println("Enter The Rate Of Interest ->");
                // int rate=sc.nextInt();
                // System.out.println("Enter The Time In Year ->");
                // int time=sc.nextInt();
                // calcInterest(principal,rate,time);

                // System.out.println("Enter The First Number");
                // int num1=sc.nextInt();
                // System.out.println("Enter The Second Number");
                // int num2=sc.nextInt();
                // System.out.println("Enter The Operator -> (+,-,*,/)");
                // String op=sc.next();
                // calc(num1,num2,op);
                
                // System.out.println("Enter The First Number");
                // int num1=sc.nextInt();
                // System.out.println("Enter The Second Number");
                // int num2=sc.nextInt();
                // largestOftwo(num1,num2);

                // System.out.println("Enter Rupees For Converting in USD ->");
                // int rupees=sc.nextInt();
                // convToUsd(rupees);

                // System.out.println("Enter the number at which u want fibonacci series -> ");
                // int terms=sc.nextInt();
                // fibo(terms);

                // System.out.println("Enter The String You want to check pallindrome -> ");
                // String str=sc.next();
                // pallindrome(str.toLowerCase());

                System.out.println("Enter The Number You want to check is Armstrong or not");
                int num=sc.nextInt();
                armstrong(num);
        }

        // public static void evenOrOdd(int num){
        //         if( (num&1) == 0){   //Method-2 num%2==0
        //                 System.out.println("Number Is Even");
        //         }else{
        //                 System.out.println("Number Is Odd");
        //         }
        // }

        // public static void greet(String name){
        //         System.out.println("Hello "+name+", Welcome To BantTech" );
        // }

        // public static void calcInterest(int principal,int rate,int time){
        //         int si=(principal*rate*time)/100;
        //         System.out.println("The Total Interest is -> "+ si);
        //         System.out.println("The Total Amount is -> "+ (si+principal) );
        // }
 
        // public static void calc(int num1,int num2,String op){
        //         switch (op) {
        //                 case "+":
        //                        System.out.println("The Sum of both Num is ->" + (num1+num2)); 
        //                         break;
        //                 case "-":
        //                        System.out.println("The Substraction of both Num is ->" + (num1-num2)); 
        //                         break;
        //                 case "*":
        //                        System.out.println("The Multiplication of both Num is ->" + (num1*num2)); 
        //                         break;
        //                 case "/":
        //                        System.out.println("The Division of both Num is ->" + (num1/num2)); 
        //                         break;
        //                 default:
        //                         System.out.println("Enter The Valid Operator For calculation...."); 
        //                         break;
        //         }
        // }

        // public static void largestOftwo(int num1,int num2){
        //         System.out.println("The Largest Num is "+ (num1>num2 ? "First Number -> "+ num1 :"Second Number -> "+ num2));
        // }

        // public static void convToUsd(int rupees){
        //         double usd=rupees/87.20;
        //         System.out.println("The Total Value of Rupees in USD is -> $ "+String.format("%.2f", usd));
        // }

        // public static void fibo(int terms){
        //         if (terms<1){
        //                 System.out.println("Enter Positive Number of terms"); 
        //                 return;
        //         } 
        //         int f1=0,f2=1,n;
        //         System.out.print(f1+" ");
        //         if(terms>1) System.out.println(f2+" ");
        //         for(int i=2;i<terms;i++){
        //                 n=f1+f2;
        //                 System.out.print(n +" "); 
        //                 f1=f2;
        //                 f2=n;
        //         }
        // }

        // public static void pallindrome(String str){
        //         int left=0;
        //         int right=str.length()-1;
        //         while(left<right){
        //                 if(str.charAt(left)==str.charAt(right)){
        //                         left++;
        //                         right--;
        //                 }else{
        //                         System.out.println("String Is Not A Pallindrome String");
        //                         return;
        //                 }
        //         }
        //         System.out.println("The String is Pallindrome");
        // }

        public static void armstrong(int num){

                if (num < 0) {
                        System.out.println("Negative numbers cannot be Armstrong numbers.");
                        return;
                    }
            
                int count=0,temp=num,temp2=num;
                
                while(temp!=0){
                        temp /= 10;
                        count++;
                }
               
                int sum=0;

                while(temp2!=0){
                        int rem=temp2%10;
                        sum+=Math.pow(rem, count);
                        temp2 /= 10;
                }

                System.out.println("The Number is "+ (sum==num ? "Armstrong Number" : "Not an Armstrong Number"));

        }
}

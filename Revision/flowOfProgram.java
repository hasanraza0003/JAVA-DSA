import java.util.*;

public class flowOfProgram {
        public static void main(String[] args) {
                System.out.println("Hello");

                Scanner sc = new Scanner(System.in);

                // // Leap year
                // //Array input
                // int n=sc.nextInt();
                // int i=0;
                // int[] year=new int[n];
                // while(i<n){
                // year[i]=sc.nextInt();
                // i++;
                // }
                // //loop through array to check leap or not
                // for(int j=0;j<n;j++){
                // System.out.println(year[j]+"->"+ leapYear(year[j]));
                // }

                // // two num sum
                // int a=sc.nextInt();
                // int b=sc.nextInt();
                // System.out.println(a+b);

                // table of number
                // System.out.println("Enter the num u want table of num : ");
                // int num=sc.nextInt();
                // for (int i = 1; i <= 10; i++) {
                // System.out.println(num+"*"+i+"=>"+i*num);
                // }

                // lcm and hcf
                // int x = sc.nextInt();
                // int y = sc.nextInt();
                // hcfAndlcm(x, y);

                // Sum of All 
                // int sum=0;
                // String cmd="";
                // while(!cmd.equals("x")){
                //         if(sc.hasNextInt()){
                //                 sum+=sc.nextInt();
                //         }else{
                //                 cmd=sc.next();
                //         }
                // }
                // System.out.println("The Total Sum is -> " + sum);
        
                
        
        }

        public static String leapYear(int year) {

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        return ("Leap Year");
                } else {
                        return ("Year Is Not A Leap Year");
                }
        }

        public static void hcfAndlcm(int x,int y){
                int temp,temp1,temp2;
                temp1=x;
                temp2=y;
                while(temp2!=0){
                        temp=temp2;
                        temp2=temp1%temp2;
                        temp1=temp;
                }
                int hcf=temp1;
                int lcm=(x*y)/hcf;

                System.out.println("hcf is -> "+hcf);
                System.out.println("lcm is -> "+lcm);
        }
}
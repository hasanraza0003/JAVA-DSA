import java.util.Scanner;

public class mapCordinate{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                
                System.out.println("Enter The Number Of Test Cases -> ");
                int t=sc.nextInt();

                while(t-- >0){       
                        System.out.println("Enter The Steps ->  ");
                        String str=sc.next();
                        
                        cordinates(str);
                }

                sc.close();
        }

        public static void cordinates(String str){
                int n=str.length();
                int x=0,y=0;

                for (int i = 0; i < n; i++) {
                        char ch=str.charAt(i);

                        if (ch == 'U') y++ ;
                        else if(ch == 'D') y-- ;
                        else if(ch == 'L') x-- ;
                        else if(ch == 'R') x++ ;
                        else{
                                System.out.println("Enter Valid String ");
                                return;
                        }

                }
                System.out.println(x+" "+y);

        } 

}


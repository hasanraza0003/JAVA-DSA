import java.util.Scanner;
import java.util.*;

public class charFreq {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                sc.nextLine();

                while(t-- >0){
                        System.out.println("Enter The String For Decode -> ");
                        String str=sc.nextLine();

                        countChar(str);
                }

                sc.close();
        }

        public static void countChar(String str){

                int n=str.length();
                Map<Character,Integer> mp=new TreeMap<>();


                for(int i=0;i<n;i++){
                        char ch=str.charAt(i);
                        if(ch==' ') continue;
                        if(Character.isDigit(ch)) continue;
                        mp.put(ch,(mp.getOrDefault(ch,0)+1));
                }

                if(mp.size()==0){
                        System.out.println("All Character is Number...Not Alphabets");
                        return;
                }

                for(Map.Entry<Character,Integer> data:mp.entrySet()){
                        System.out.println(data.getKey() +"->"+ data.getValue());
                }

        }

}

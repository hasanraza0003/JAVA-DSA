import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ->");
        String str = sc.nextLine();
        // System.out.println("Enter The Second String ->");
        // String str2 = sc.nextLine();

        // System.out.println(removeVowelsZ(str.toLowerCase()));
        // System.out.println(modify(str));
        // System.out.println(removeChars(str.toLowerCase(),str2.toLowerCase()));
        // System.out.println(removeSpecialCharacter(str));
        // System.out.println(reverseString(str));
        // System.out.println(findSum(str));
        System.out.println(capitalizeFandL(str));

        sc.close();
    }

    public static String removeVowelsZ(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String modify(String s) { // remove white spaces in all string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                continue;
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    public static String removeChars(String string1, String string2){
        // code here
        // for(int i=0;i<string2.length();i++){
        //     char ch=string2.charAt(i);
        //     string1 = string1.replace(String.valueOf(ch),"");
        // }
         
        // return string1;
        
        // o(n^2) - tc
        
        Set<Character> st=new HashSet<>();
        
        for(int i=0;i<string2.length();i++){
            char ch=string2.charAt(i);
            st.add(ch);
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<string1.length();i++){
            char ch=string1.charAt(i);
            if(st.contains(ch)){
                continue;
            }
            sb.append(ch);
        }
        
        return sb.toString();
        
        // o(n+m) - tc
    }

    public static String removeSpecialCharacter(String s) {
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                sb.append(ch);
            }
        }
        
        return sb.length() > 0 ? sb.toString() : "-1";
    }

    public static String reverseString(String s) {
        // 1 - optimal way 
        // StringBuilder sb=new StringBuilder(s);
        // return sb.reverse().toString();
        
        // 2 - takes a bit storage 
        // String nstr="";
        // for(int i=s.length()-1;i >= 0;i--){
        //     nstr += s.charAt(i);
        // }
        // return nstr;
        
        // 3 - Using stack 
        // Stack<Character> stack = new Stack<>();
        
        // for (char c : s.toCharArray()) {
        //     stack.push(c);
        // }

        // StringBuilder reversed = new StringBuilder();
        // while (!stack.isEmpty()) {
        //     reversed.append(stack.pop());
        // }

        // return reversed.toString();
        
        // 4- using charArray 
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(charArray);
        return reversed;
    }

    public static int findSum(String s) {
        long sum=0;
        long num=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(Character.isDigit(ch)){
                // num=num*10+Character.getNumericValue(ch); //get numeric value from character
                num=num*10+Integer.parseInt(ch+""); //str to int
            }else{
                sum+=num;
                num=0;
            }
        }
        return (int) (sum+num);
    }

    public static String capitalizeFandL(String s){
        String words[]=s.split("\\s+");
        StringBuilder res=new StringBuilder();

        for(int i=0;i<words.length;i++){
            String str=words[i];

            if(!str.isEmpty()){
                int len=str.length();

                if(len==1){
                    res.append(Character.toUpperCase(str.charAt(0)));
                }else{
                    res.append(Character.toUpperCase(str.charAt(0)))
                    .append(str.substring(1, len-1).toLowerCase())
                    .append(Character.toUpperCase(str.charAt(len-1)));
                }

                res.append(" ");
            }
        }

        return res.toString().trim();
    }
}
import java.util.*;

public class day1String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ->");
        String str = sc.nextLine();
        // System.out.println("Enter The Second String ->");
        // String str2 = sc.nextLine();

        // System.out.println(removeVowelsZ(str.toLowerCase()));
        // System.out.println(modify(str));
        // System.out.println(removeChars(str.toLowerCase(),str2.toLowerCase()));
        System.out.println(removeSpecialCharacter(str));

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
}
package StringPrograms;

import java.util.Stack;

public class LeetCodeReverse {
	
	
public static void main(String[] args) {
		
		
		String s = "I (Love (you)) too.";
		System.out.println(reverseParentheses(s));
		
}
	
	
	public static  String reverseParentheses(String s) {
        if(s.length()<=1) return s;
        char[] str = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length;i++) {
            char c = str[i];
            if(c=='(') {
                stack.push(i);              //save the index of '('
            }else if(c==')'){
                int start = stack.pop();    //get the index of '('
                reverse(str, start+1, i-1);                
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:str){
            if(c!='(' && c!=')') sb.append(c);
        }
        return sb.toString();
    }
    
    private static void reverse(char[] chars, int start, int end) {
        while(start<end && chars[start]=='(') start++;    //skip open '('   handle cases like  consective '(' like (( 
        while(start<end){
            char temp = chars[start];
            chars[start]= chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

}

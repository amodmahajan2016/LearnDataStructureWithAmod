package StringPrograms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseCharInParenthesis {

	public static void main(String[] args) {
		
		
		String s = "I (Love (you)) too.";
		
		
		Stack<Character> stack = new Stack();
        char[] arr = s.toCharArray();
        for (char cur: arr) {
            if (cur!=')') stack.push(cur);
            else {
                Queue<Character> temp = new LinkedList();
                while(stack.peek()!='(') {
                    temp.offer(stack.pop());
                }
                stack.pop();
                while(!temp.isEmpty()) stack.push(temp.poll());
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop()+"");
        System.out.println(sb.reverse().toString());
		
		
//		Deque<StringBuilder> list = new LinkedList<StringBuilder>();
//	    list.addLast(new StringBuilder());
//	    for (char c : s.toCharArray()) {
//	        if (c == '(') {
//	            list.addLast(new StringBuilder());
//	        } else if (c == ')') {
//			    StringBuilder sb = list.removeLast();
//	            list.peekLast().append(sb.reverse());
//	        } else {
//	            list.peekLast().append(c);
//	        }
//	    }
//	        
//	    StringBuilder result = new StringBuilder();
//	    for (StringBuilder sb : list) {
//	        result.append(sb.toString());
//	    }
//	    
//	    System.out.println(result);
//		String result = "";
//		int start = 0;
//		
//		Stack<Character> stack = new Stack<Character>();
//		
//		for(int i = 0; i> str.length() ; i++)
//		{
//			if(str.charAt(i) == '(')
//				start = i;
//			else if(str.charAt(i) == ')')
//			{
//				String reverse = str.substring(start,i);
//				StringBuilder sb = new StringBuilder(reverse);
//				reverse = sb.reverse().toString();
//				
//			}
//				
//				
//		}

				
	}
}

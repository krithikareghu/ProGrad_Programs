package assignment;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the string");
		String str = obj.nextLine();
		System.out.println(balanceparentheses(str));

	}

	static String balanceparentheses(String parenthesis) {
		String ans = "";
		int check;
		Stack<Character> s = new Stack<>();

		for (int i = 0; i < parenthesis.length(); i++) {
			char x = parenthesis.charAt(i);
			
			 //if it is opening bracket push it to the stack and add it to the answer

			if (x == '(' || x == '[' || x == '{')
			{
				s.push(x);
				ans += x;
				continue;
			}
			
			
			/*if stack is empty we have to add the opening and closing  bracket 
			according to the current closing bracket*/
			
			if (s.isEmpty()) 
			{ 
				if (x == ']')
					ans += '[';
				else
					ans += (x == ')') ? '(' : '{';

				ans += x;
				continue;
			}
			
     /*  take the current  closing bracket if it's opening bracket is already in the stack then
        pop all the elements int the stack and  */
					
			switch (x) 
			{
			case ')':
				if (s.contains('(')) 
				{				
					while (s.peek() != '(')  // till we get the top opening element as closing bracket
					{
						check = s.pop();
						ans += (check == '{') ? '}' : ']';
					}
					s.pop();
					ans += ')';
				} 
				
				/*since the opening bracket for the current closing bracket is not 
				there in the stack so open and close it accordingly*/
				
				else 
				{
					ans += '(';
					ans += ')';
				}
				break;

			case '}':
				if (s.contains('{')) 
				{
					while (s.peek() != '{') 
					{
						check = s.pop();
						ans += (check == '(') ? ')' : ']';
					}
					s.pop();
					ans += '}';
				} 
				else 
				{
					ans += '{';
					ans += '}';
				}
				break;

			case ']':
				if (s.contains('[')) 
				{
					while (s.peek() != '[') 
					{
						check = s.pop();
						ans += (check == '(') ? ')' : '}';
					}
					s.pop();
					ans += ']';
				} 
				else
				{
					ans += '[';
					ans += ']';
				}
				break;
			}
		}
		
		// if the opening elements are still in stack it means we didn't close the brackets
		while (!s.isEmpty())  
		{
			if (s.peek() == '(')
			{
				ans += ')';
				s.pop();
			} 
			else if (s.peek() == '[')
			{
				ans += ']';
				s.pop();
			} 
			else if (s.peek() == '{')
			{
				ans += '}';
				s.pop();
			}
		}
		return ans;
	}

}

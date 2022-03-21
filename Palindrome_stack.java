package assignment;
import java.util.*;
public class Palindrome_stack {


public static void main(String[] args) {	
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the string");
		String str = obj.nextLine();
		
		if(palindrome(str))
			System.out.println(str);
		else
          perfectpalindrome(str,str.length());
        
	}
	
	static boolean palindrome(String str)
    {
        int i = 0, j = str.length() - 1;        
      
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
	
	static void perfectpalindrome(String str,int n)
	{
		
		Stack<Character>elementStack=new Stack<>();
		
		for(int i=0;i<n;i++) {   // pushing all the characters into the stack
			elementStack.push(str.charAt(i));
		}
		
	    char last=elementStack.pop(); // storing the last character to check if there is any repetition
	    
	    while(last==elementStack.peek())    // elements at the end equal pop it off
	    {
    		last=elementStack.pop();
	    	continue;
	    }
	    
	    while(!elementStack.empty())  
	    {
	    		last=elementStack.pop();
	    		str+=last;
	    }    
		
		System.out.println(str);
		
	}

}

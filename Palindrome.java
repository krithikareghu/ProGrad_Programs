package assignment;

import java.util.Scanner;

public class Palindrome {

 public static void main(String[] args) {
       
                Scanner obj = new Scanner(System.in);
		System.out.println("enter the string");
		String str = obj.nextLine();
                System.out.println(perfectpalindrome(str));
               
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
    static String perfectpalindrome(String str)
    {
        String perfect="";
          if(palindrome(str))
          {
              return str;
          }
          
          else{
             boolean flag=false;
             for(int k=str.length()-1;k>0;k--)
             {               
                 if(str.charAt(k)==str.charAt(k-1)&&k==str.length()-1)
                   {
                       flag=true;
                      continue;
                   }
                 else{
                     if(k>1)
                        str+=str.charAt(k-1);
                     flag=false;
                 }  
             }
              str+=str.charAt(0);
          }
          return str;
    }
    
}

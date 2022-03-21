/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.Scanner;

public class PerfectPRString {
    
    static void PRString(String str)
    {
        boolean flag=true;
        int s=0;
        int f=s+2;
        char prev=str.charAt(s);
        
        while(str.length()>2&&f<str.length())
        {           
          if(str.charAt(s)!='P'&&str.charAt(s)!='R') //IT IT IS SOME OTHER ALPHABET
          { 
              flag=false;
              break;
          }
          
          else if(str.charAt(s)!=str.charAt(f))//IF THE ALTERNATIVE ELEMENTS NOT EQUAL
          {
              flag=false;
              break;
          }
          
          s++;
          
          if(str.charAt(s)==prev) // RRR OR PPP CONDITION
          {
              flag=false;
              break;
          }
          
          prev=str.charAt(s);
          f++;
         
        }
        
        if(str.length()==1){
            
            if(str.charAt(s)!='P'&&str.charAt(s)!='R') //IT IT IS SOME OTHER ALPHABET
                flag=false;
            
            else if(str.charAt(0)!='P'&&str.charAt(0)!='R')//IF THE LENGTH IS 1 IT SHOULD BE P OR R
            {
                flag=false;
            }
        }
        
        else if(str.length()==2)// IF LENGTH IS 2 IT SHOULD BE EITHER  PR OR  RP
        {
            if(str.charAt(s)!='P'&&str.charAt(s)!='R') //IT IT IS SOME OTHER ALPHABET
                flag=false;
            
            else if(str.charAt(0)=='P'&& str.charAt(1)!='R')
            {
               flag=false;
            }
            else if(str.charAt(0)=='R'&& str.charAt(1)!='P')
            {
               flag=false;
            }
        }
        
        if(flag==true)
            System.out.println("Perfect");
        else
            System.out.println("Imperfect");
    }
                
public static void main(String[] args) 
  {
                Scanner obj = new Scanner(System.in);
		System.out.println("enter the string");
		String Prstring = obj.nextLine();
                PRString(Prstring);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.util.*;
/**
 *
 * @author VC
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    static int fact(int n) {
      if(n == 0 || n == 1 )
        return 1;
       return n*fact(n-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        String in=obj.nextLine();
        System.out.println(countPermutation(in));
    }
    
   static int countPermutation(String str) {
       int answer;
       int num=fact(str.length());
       int den=duplicates(str);
       System.out.println(num+"/"+den);
       answer=num/den;
       return answer;  
    }
   
   static int duplicates(String str)
   {
       HashMap<Character,Integer>duplicate=new HashMap<>();
       for(int i=0;i<str.length();i++)
       {
           if(duplicate.containsKey(str.charAt(i)))
           {
              duplicate.put(str.charAt(i), duplicate.getOrDefault(str.charAt(i), 0) + 1);
           }
           else{
              duplicate.put(str.charAt(i), 1); 
           }          
       }      
       System.out.println(duplicate);
       int duplicatecount=1;
       for(int i:duplicate.values())
       {
           if(i>1)
               duplicatecount*=fact(i);
       }
       return duplicatecount;    
   }  
}



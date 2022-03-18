/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operatorexception;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author VC
 */
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
public class Operatorexception   {
    
    static void operation(int a,int b,char operator )throws MyException
{ try{
     
    switch (operator) {
        case '+':
            System.out.println( a+b);
            break;
        case '-':
            System.out.println( a-b);
            break;
        case '*':
            System.out.println( a*b);
            break;
        case '/':          
            System.out.println( a/b);
            break;    
        default:
           throw new InputMismatchException();}
}catch( InputMismatchException ex) 
            {
                System.out.println("invalid operator");
            } 
    
    }

    /**
     * @param args the command line arguments
     * @throws operatorexception.MyException
     * 
     */
        public static void main(String[] args)  
        {

            Scanner obj = new Scanner(System.in);
            int a=0,b=0;
            System.out.println("enter the space separated string");
            String str = obj.nextLine();
            String[] arrOfStr = str.split(" ");
            
            try{
                 a=Integer.parseInt(arrOfStr[0]);
                  b=Integer.parseInt(arrOfStr[2]);
            }catch(NumberFormatException ex)
                {
                    System.out.println("invalid operand");  
                }
            
            char c=  arrOfStr[1].charAt(0);
            try {
            operation(a, b, c);
            } catch (MyException ex) {
            Logger.getLogger(Operatorexception.class.getName()).log(Level.SEVERE, null, ex);
            }    
    }      
} 

        



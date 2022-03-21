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

    public MyException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

public class Operatorexception {

    static void operation(int a, int b, char operator) throws MyException {
       
            switch (operator) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                default:
                    throw new InputMismatchException();
            }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = 0, b = 0;
        char c;
        System.out.println("enter the string");

        String str = obj.nextLine();
        String[] arrOfStr = str.split(" ");

        try {
            a = Integer.parseInt(arrOfStr[0]);
            b = Integer.parseInt(arrOfStr[2]);
            c = arrOfStr[1].charAt(0);
            operation(a, b, c);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid String");
        }
        catch (NumberFormatException ex) {
            System.out.println("Invalid operand");
        }
        catch (InputMismatchException ex) {
            System.out.println("Invalid operator");
        }
        catch (MyException ex) {
            Logger.getLogger(Operatorexception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

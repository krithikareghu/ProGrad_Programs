/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.io.*;
import java.util.*;
/**
 *
 * @author VC
 */
public class Anagram_HashMap {
  public static void main (String[]args)
  {
    HashMap < Character, Integer > anagram =  new HashMap < Character, Integer > ();
    Scanner obj = new Scanner (System.in);
    String name1 = obj.nextLine ();
    String name2 = obj.nextLine ();
    if (name1.length () != name2.length ())
      {
	    System.out.println ("false");
      }
    else
    {
	char[] strArray1 = name1.toCharArray ();
	char[] strArray2 = name2.toCharArray ();
        
    for (char c:strArray1)
	  {
	    if (anagram.containsKey (c))
	      anagram.put (c, anagram.get (c) + 1);
	    else
	      anagram.put (c, 1);
	  }
    
    for (char c:strArray2)
	  {
	    if (anagram.containsKey (c))
		    anagram.put (c, anagram.get (c) - 1);
        else
		  anagram.put (c, 1);
	  }
	System.out.println (check (anagram));
      }
  }
static boolean check (HashMap < Character, Integer > anagram)
{
  for (int a:anagram.values ())
    {
	  if (a != 0)
	     return false;
    }
    return true;
}
}

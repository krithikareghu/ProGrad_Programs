/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

/**
 *
 * @author VC
 */

import java.util.*;
import java.util.Collections;
public class Swap {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of elements to be added");
        int n=obj.nextInt();
        ArrayList<Integer> arr= new ArrayList<>(n);
        
       for (int i = 0; i < n; i++)
       {
           int element=obj.nextInt();
           arr.add(element);
       }
       
       /*for(int i=0;i<n-1;i+=2)
       {
           Collections.swap(arr, i, i+1);
       }*/
        
        System.out.println(swap(arr));
       
    }
    static ArrayList<Integer> swap( ArrayList<Integer> str)
    {
     int l,f=0;
     if(str.size()%2==0)
        l=str.size()-1;
     else
        l=str.size()-2;
     for(int i=0;i<str.size()-1;i+=2)
     {
        Collections.swap(str, f, f+1);
        Collections.swap(str, l, l-1);
        f=f+2;
        l=l-2;
     }
     return str;
  
    }

}

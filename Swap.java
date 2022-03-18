
package assignment;

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
        
       for(int i=0;i<n-1;i+=2)
       {
           Collections.swap(arr, i, i+1);
       }
        System.out.println(arr);
    }
}
    



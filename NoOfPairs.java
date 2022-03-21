/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.*;

public class NoOfPairs {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int n = obj.nextInt();
        System.out.println("enter the product to be searched ");
        int product = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println(countPairsWithProductK(arr, n, product));

    }

    static int countPairsWithProductK(int arr[], int n, int k) {

        int count = 0;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            double index = k % arr[i];
            if (index == 0) {
                hashMap.put(x, true);
            }
        }

        for (Map.Entry Element : hashMap.entrySet()) {
            boolean flag = (boolean) Element.getValue();

            if (flag == true) {
                int divisor = (int) Element.getKey();
                int rem = k / divisor;
                if (hashMap.containsKey(rem)) {
                    System.out.println(divisor + " * " + rem + " = " + k);
                    count++;
                    hashMap.replace(divisor, false);
                    hashMap.replace(rem, false);
                }
            }
        }
        return count;
    }

}

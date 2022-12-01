/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kutena;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author zdenek.kutena
 */
public final class ArrayTools {
    
    private static final Random RND = new Random();
    
    private static Scanner sc = new Scanner(System.in);
    
    private ArrayTools() {
        
    }
    
    public static int[] nahodnaPermutace(int n) {
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = i+1;
            int pos = RND.nextInt(n);
            
            int pom = a[i];
            a[i] = a[pos];
            a[pos] = pom;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] perm = nahodnaPermutace(8);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(perm));
        }
    }
}
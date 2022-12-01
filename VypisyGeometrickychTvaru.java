/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kutena;

import java.util.Scanner;

/**
 *
 * @author zdenek.kutena
 */
public class VypisyGeometrickychTvaru {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej celé kladné číslo");
        
        int n = sc.nextInt();
        
        if (n <=0) {
            return;
        }
        
        System.out.println("Vertikálně");
        for (int i = 0; i<n; i++) {
            System.out.print("* ");
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Horizontálně");
        for (int i = 0; i<n; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        
        System.out.println("");
        System.out.println("Čtverec");
        
        // pro každý n řádek -> vypiš stejný počet n členů řádků
        //
        // když vstup bude 4 -> 
        
        for (int i = 0; i<n; i++) {
            for (int u = 0; u<n; u++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Stupňovitý trojúhelník");
        
        // vstup 5 
        // řádek -> u+1
        
        for (int i = 1; i<=n; i++) {
            for (int u = 0; u<i; u++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Trojúhelník");
        
        // ...
        
        // musím jistit zda je číslo prvnočíslo, aby měla prostřední prvek
        
        for (int i = 0; i==(n/2); i++) {
            for (int u = 0; u<i; u++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

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
public class FaktorialCisla {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej celé číslo");
        int n = sc.nextInt();
        int vys = 1;
        
        while (n > 0) {
            vys =+ vys*n;
            n = n-1;
        }
        System.out.println("Výsledek : " + vys);
    }
}

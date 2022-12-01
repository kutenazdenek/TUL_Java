/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kutena;

/**
 *
 * @author zdenek.kutena
 */

import java.util.Scanner;

public class VymenaCisel {

    /**
     * tabulka je indexovaná od jedničky
     * první část hledá číslo na základě souřadnic. řádků a sloupců
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej první číslo ");
        int a = sc.nextInt();
        System.out.println("zadej druhé číslo ");
        int b = sc.nextInt();
        System.out.format("Čísla jsou %d a %d %n", a,b);
        
        int pom = a;
        a = b;
        b = pom;
        
        System.out.format("Čísla jsou %d a %d %n", a,b);
        System.out.println("Konec");
    }
    
}

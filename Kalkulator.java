/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kutena;
import java.util.Scanner;
/** kalkulator bez priority
 * kalkulator s prioritou
 * @author zdenek.kutena
 */
public class Kalkulator {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        float vysledek;
        char op;
        System.out.println("Zadej výraz");
        vysledek = sc.nextFloat();
        while ((op=sc.next().charAt(0)) != '=') {
            float cislo = sc.nextFloat();
            // spravovat operaci
            // switch
            // vysledek
            
        }
        System.out.println(vysledek);
        
        // jinak
        
        vysledek = sc.nextFloat();
        do  {
            op = sc.next().charAt(0);
            if (op != '=') {
                float cislo = sc.nextFloat();
                // zapracovat cislo do výsledku
            }
        } while (op != '=');
    }
}

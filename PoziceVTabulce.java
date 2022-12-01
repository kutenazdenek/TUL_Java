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
public class PoziceVTabulce {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej počet řádků, poté počet sloupců");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        
        System.out.println("Zadej souřadnice čísla, řádky poté sloupce");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int position = (y-1)*rows + x;
        
        System.out.println("Vaše pozice je : " + position);
    }
}

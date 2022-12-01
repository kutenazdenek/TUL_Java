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
public class test {

    /**
     * tabulka je indexovaná od jedničky
     * první část hledá číslo na základě souřadnic. řádků a sloupců
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rok = sc.nextInt();
        boolean prestupnost = (rok % 4 == 0) &&
                (rok % 100 != 0) || (rok % 400 == 0);
        /* prestupny rok je delitelny 4 ale nesmi byt defitelny 100 */
        
    }
    
}
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
public class TypTrojuhelnika {
    
    private static Scanner sc = new Scanner(System.in);
    // typ dle úhlu
    private static final byte OSTRUHLY = 0;
    private static final byte PRAVOUHLY = 1;
    private static final byte TUPOUHLY = 2;
    // typ dle stran
    private static final byte OBECNY = 0;
    private static final byte ROVNORAMENNY = 1;
    private static final byte ROVNOSTRANNY = 2;
    
    public static void main(String[] args) {
        // nacti tri delky cisla dc, x,y,z
        System.out.println("Zadej délky tří stran trojúhelníka (x, y, z) :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
    }
    
    // urci zda lze sestrojit trojuhelnik ze zadaných delek, trojuh. nerovnosti, nezap. cisla
    
    // priradit do a,b,c tak, aby a<= b <= c
    
    // uci typ dle uhlu - ostrojhly pravouhly,...
}

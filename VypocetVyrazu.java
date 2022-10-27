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
public class VypocetVyrazu {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej výraz");
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float op = sc.next().charAt(0);
        
        float c;
        
        switch(op) {
            case '+' : c = a + b; break;
            case '-' : c = a - b; break;
            case '*' : c = a * b; break;
            case '/' : c = a / b; break;
            default : c = Float.NaN;
        }
        
        // jsseeem moc ospalej na to, abych přišel na to kde je chyba
    }
}

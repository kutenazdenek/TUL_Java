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
public class Posloupnost {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Minimum, maximum");
            System.out.println("Zadej počet");
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int c = sc.nextInt();

            for (int k = 1; k < n; k++) {
                c = sc.nextInt();

                if (c > max) {
                    max = c;
                }
                if (c < min) {
                    c = min;
                }
            }
            System.out.println("Výsledek " + max);
        }
}

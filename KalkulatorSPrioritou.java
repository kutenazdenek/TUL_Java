/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kutena;
import java.util.Scanner;

import java.util.Scanner;

public class KalkulatorSPrioritou {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double res = 0, temp = 0, temp2 = 0;
        char op = 0, op2 = 0;

        while (sc.hasNext()) {

            // def
            if (res == 0 && op == 0) {
                res = sc.nextDouble();
                System.out.println("res : "+res);
            } else if (op == 0) {
                op = sc.next().charAt(0);
                if (op != '+' && op != '-' && op != '*' && op != '/' && op != '=') {
                    System.out.println("Neidentifikovatelný operátor"); System.exit(0);
                }
                System.out.println("op : "+op);
            } else if (temp == 0) {
                temp = sc.nextDouble();
                System.out.println("temp : "+temp);
            } else if (op2 == 0) {
                op2 = sc.next().charAt(0);
                if (op2 != '+' && op2 != '-' && op2 != '*' && op2 != '/' && op2 != '=') {
                    System.out.println("Neidentifikovatelný operátor"); System.exit(0);
                }
                System.out.println("op2 : "+op2);
            } else if (temp2 == 0) {
                temp2 = sc.nextDouble();
                System.out.println("temp2 : "+temp2);
            }

            // count
            if (op == '=' && res != 0) {
                System.out.println("Výsledek : "+res);
                System.exit(0);
            } else if (op2 == '=' && res != 0 && temp !=0) {
                switch (op) {
                    case '+' : res += temp; break;
                    case '-' : res -= temp; break;
                    case '*' : res *= temp; break;
                    case '/' : res /= temp; break;
                    default : System.out.println("Neidentifikovatelný operátor"); System.exit(0); break;
                }
                System.out.println("Výsledek : "+res);
                System.exit(0);
            } else if (op2 == '+' | op2 == '-') {
                switch (op) {
                    case '+' : res += temp; break;
                    case '-' : res -= temp; break;
                    case '*' : res *= temp; break;
                    case '/' : res /= temp; break;
                }
                // move vars
                temp = 0; 
                op = op2;
                op2 = 0;
            } else if (temp2 != 0 && op2 != 0) {
                // priority
                switch (op2) {
                    case '*' : temp *= temp2; break;
                    case '/' : temp /= temp2; break;
                    default : System.out.println("Neidentifikovatelný operátor"); System.exit(0); break;
                }
                switch (op) {
                    case '+' : res += temp; break;
                    case '-' : res -= temp; break;
                    case '*' : res *= temp; break;
                    case '/' : res /= temp; break;
                    default : System.out.println("Neidentifikovatelný operátor"); System.exit(0); break;
                }
                op = 0; op2 = 0; temp = 0; temp2 = 0;

            }
        }
    } 
}

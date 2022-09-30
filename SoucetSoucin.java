import java.util.Scanner;

public class SoucetSoucin {
    public static void main(String[] args) {

        // declaration
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Vypiš dvě čísla");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // output
        System.out.println("Součet : " + (num1+num2));
        System.out.println("Součin : " + (num1*num2));
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kutena;

/**
 *
 * @author zdenek.kutena
 */
public class MatrixTools2 {
    private final class MatrixTools {
        private MatrixTools() {
            
            /**
             * Testuje symetrii matice celých čísel dle hlavní diagonály
             * Matice musí být neprázdná
             * @param a matice celých čísel
             * @return výsledek testu : true je matice symetrická, false či nikoliv
             */
            
            public static boolean jeSymetricka(int[][] a) {
                /*
                if (a.length != a[0].length) {
                    return false;
                }
                */
                
                // test symetrie hodnot nikoliv nikoliv velikosti matice podle podle hl. diagonály
                
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[0].length; j++) {
                        if (a[i][j] != a[j][i]) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
    }
}

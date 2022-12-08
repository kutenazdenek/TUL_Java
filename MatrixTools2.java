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
            
            public static boolean jeSymetricka(double[][] a, int epsFaktor) {
                double max = absMax(a);
                // ... double eps = ;
            }
            
            public static double absMax(double[][] a) {
                
            }
            
            // dalsi...
            /**
             * testuje zda soucty ve vsech radcich, sloupcich 
             * a obouch diagonalach jsou stejne
             * @param a
             * @return 
             */
            public static boolean souctyStejne(int[][] a) {
                
                   int ps;
                   int n = a.length;
                   for (int i = 0; i < a.length; i++) {
                       ps += a[i][i];
                   }
                   
                   for (int i = 0; i < n; i++) {
                       int srad = 0;
                       int ssloupec = 0;
                       for (int j = 0; j < n; j++) {
                           srad += a [i][j];
                           ssloupec += a[j][i];
                       }
                       if (srad != ps) {
                           return false;
                       }
                       if (ssloupec != ps) {
                           return false;
                       }
                   }
                   int sdiag = 0;
                   for (int i = 0; i < n; i++) {
                       sdiag += a[i][n -1 -i];
                   }
                   if (sdiag != ps) {
                       return false;
                   }
                   return true;
                
                /*
                boolean dano = false;
                int prvniradek = 0, prvnisloupec = 0;
                
                for (int i = 0; i < a.length; i++) {
                    int soucet1 = 0, soucet2 = 0;
                    for (int j = 0; j < a[0].length; j++) {
                        soucet1 += a[i][j];
                        soucet2 += a[j][i];
                    }
                    if (!dano) {
                        prvniradek = soucet1;
                        dano = true;
                    }
                    if (soucet1 != soucet2) {
                        return false;
                    }
                }
                */
            }
            
            /**
             * obsahuje vsechna cisla
             */
        }
    }
}
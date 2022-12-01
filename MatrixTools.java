/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kutena;

/**
 *
 * @author zdenek.kutena
 */
public class MatrixTools {
    /**
     * @param args the command line arguments
     */
    
    // double[][] -- dvourozmerna
    // double[m][n] -- [radky][sloupce]
    // a = new double[m][n];
    // a[i] -- double[]
    // a[i][j] -- double
    // a.length - m (5)
    // a[i].length - n (3)
    
    public static double[][] soucetMatic(double[][] a, double[][] b) {
        if (a==null) return null;
        if (b==null) return null;
        if (a.length == 0 || b.length == 0) return null;
        if (a.length != b.length) return null;
        if (a[0].length==0 || b[0].length==0) return null;
        if (a[0].length != b[0].length) return null;
        double[][] c = new double[a.length][a[0].length];
        
        return
    }
    
    public static double[][] soucinMatic(double[][] a, double[][] b) {
        
        return
    }
}

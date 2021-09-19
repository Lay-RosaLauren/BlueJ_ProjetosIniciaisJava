
/**
 * Classe para entrada de String, int e double
 * e exibição de saída como texto
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0  02/08/2021)
 */
import javax.swing.*;

public class EntradaSaida
{
    
    /**
     * Método receberString
     *
     * @param msg Um parâmetro
     * @return O valor de retorno
     */
    public static String receberString(String msg) {
        String txt;
        txt = JOptionPane.showInputDialog(msg);
        return txt;
    }
    
    /**
     * Método receberInt
     *
     * @param msg Um parâmetro
     * @return O valor de retorno
     */
    public static int receberInt(String msg) {
        String snro;
        int inro;
        snro = JOptionPane.showInputDialog(msg);
        try {
            inro = Integer.parseInt(snro);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!");
            inro = 0;
        }
        return inro;
    }
    
    /**
     * Método receberDouble
     *
     * @param msg Um parâmetro
     * @return O valor de retorno
     */
    public static double receberDouble(String msg) {
        String snro;
        double dnro;
        snro = JOptionPane.showInputDialog(msg);
        try {
            dnro = Double.parseDouble(snro);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
            dnro = 0;
        }
        return dnro;
    }
    
    public static void mostrarTexto(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}

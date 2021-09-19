/**
 * Classe auxiliar para exibição de janela de diálogo
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 30/07/2021)
 */

import javax.swing.*;

public class Tela
{
    /**
     * Metodo que exibe uma janela de diálogo para receber
     * um texto e retornar esse texto.
     * @param (String)
     * @return (String)
     */
    public static String retornaTxt(String txt) {
        String sval = JOptionPane.showInputDialog(txt);
        return sval;
    }    
    
    
    /**
     * Método que exibe uma janela de diálogo para receber
     * um texto e converter para inteiro.
     * @param (String)
     * @return (int)
     */
    public static int retornaInt(String txt) {
        String sval = retornaTxt(txt);
        int ival = Integer.parseInt(sval);
        return ival;
    }
    
    
    /**
     * Método que exibe uma janela de diálogo para receber
     * um texto e converter para double.
     * @param (String)
     * @return (double)
     */
    public static double retornaDbl(String txt) {
        String sval = retornaTxt(txt);
        double dval = Double.parseDouble(sval);
        return dval;
    }
    
    
    /**
     * Metodo que exibe uma janela de diálogo exibir
     * um texto informado por parâmetro.
     * @param (String)
     */
    public static void mostraTxt(String txt) {
        //mostra na janela de diálogo o texto informado
        JOptionPane.showMessageDialog(null, txt);
    }
}

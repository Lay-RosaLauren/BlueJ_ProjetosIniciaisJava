/**
 * EntradaSaida
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 01/08/2021)
 */
 
import javax.swing.*;

public class EntradaSaida
{
    /**
     * Metodo que exibe uma janela de diálogo para receber
     * um texto e retornar esse texto.
     * @param (String)
     * @return (String)
     */
    public static void mostrarTexto(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static String receberString (String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }
    
    public static int receberInt(String mensagem) {
        return Integer.parseInt(receberString(mensagem));
    }
}
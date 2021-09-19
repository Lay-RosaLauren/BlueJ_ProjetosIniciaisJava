
/**
 * Escreva uma descrição da classe Tela aqui.
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 30/07/2021)
 */

import javax.swing.*;

public class Tela
{
    /**
     * 
     */
    public static int retornaInt(String txt) {
        //usa o método do Java para abrir uma janela de diálogo
        // sempre retorna uma String
        String snum = JOptionPane.showInputDialog(txt);
        
        //converte a string em número
        int inum = Integer.parseInt(snum);
        
        //retorna para quem usar esse método
        return inum;
    }
    
    /**
     * 
     */
    public static void mostraTxt(String txt) {
        //mostra na janela de diálogo o texto informado
        JOptionPane.showMessageDialog(null, txt);
    }
}

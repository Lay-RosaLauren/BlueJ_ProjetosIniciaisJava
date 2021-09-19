
/**
 * Classe TesteJanela
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 26/07/2021)
 */

import javax.swing.*;

public class TesteJanela
{
    public static void main(String args[]) {
        String sida;
        //sempre virá um texto (String)
        sida = JOptionPane.showInputDialog("Digite sua idade");
        
        //mas eu posso usar uma classe para converter
        //nesse caso, converte uma String no formato de número
        //exemplo: "234" para 234
        int ida = Integer.parseInt(sida);
        
        String msg = "";
        if (ida >= 18) {
            msg = "Ok. Tudo estabelecido";
        } else {
            msg = "Não teve sorte ...oeee";
        }
        //mostra uma mensagem na janela de diálogo
        JOptionPane.showMessageDialog(null, msg);
    }
}

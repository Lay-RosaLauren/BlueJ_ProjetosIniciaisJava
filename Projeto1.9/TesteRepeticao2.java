
/**
 * Classe TesteRepeticao2
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 27/07/2021)
 */

import javax.swing.*;

public class TesteRepeticao2
{
    //codigo que recebe dados de um grupo de pessoas (nome e idade)
    //e ao final mostra os dados da pessoa com menor idade
    public static void main(String args[]) {
        //declaração das variáveis de uso dentro do "while"
        String nom;
        String sida;
        int ida;
        
        //inicialização das variáveis de controle
        String resp = "sim";
        String nomnew = "";
        int idanew = 200;
        int idatot = 0; //somador
        int nropes = 0; //contador
        
        while (resp.equalsIgnoreCase("sim")) {
                nom = JOptionPane.showInputDialog("Nome");
                sida = JOptionPane.showInputDialog("Idade");
                ida = Integer.parseInt(sida);
            
            if (ida < idanew) {
                idanew = ida; //"idanew" e a idade do mais novo
                nomnew = nom; //"nomnew" é o nome do mais novo
            }
            idatot = idatot + ida; //somador das idades
            nropes = nropes + 1; //contador de pessoas
            
            resp = JOptionPane.showInputDialog("Tem mais alguém?");
        }
    
        double media = idatot / nropes;
        JOptionPane.showMessageDialog(null, "Mais novo: "+nomnew);
        JOptionPane.showMessageDialog(null, "Menor idade: "+idanew);
        JOptionPane.showMessageDialog(null, "Media: "+media);
    }
}

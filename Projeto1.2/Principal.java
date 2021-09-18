
/**
 * Classe principal de início do sistema
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 25/07/2021)
 */
public class Principal
{
    public static void main (String[] args) {
        
        //criação do objeto
        Monitor m1 = new Monitor();
        
        //uso dos métodos disponíveis
        m1.ligar();
        m1.exibirMsg("Opa, olá pessoal");
        
        m1.ajustarReso(1600);
        m1.exibirMsg("Outra mensagem legal");
        
        m1.desligar();
        
    }
}

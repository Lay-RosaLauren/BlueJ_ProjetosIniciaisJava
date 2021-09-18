
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 24/07/2021)
 */
public class Principal
{
    public static void main(String args[])
    {
        //criação de objeto "real" para uso
        Caneta bic = new Caneta();
        
        //e aqui o uso efetivo do objeto através do seu método
        bic.ajustarCor("azul");
        bic.ajustarTamanho(12);
        bic.escrever("texto com formatação");
    }
}
    
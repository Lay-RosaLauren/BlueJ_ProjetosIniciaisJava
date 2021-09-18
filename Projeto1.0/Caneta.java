
/**
 * Classe para representar um objeto caneta e suas funcionalidades
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 24/07/2021)
 */
public class Caneta
{
    //características da caneta 
    //representadas por variáveis
    String cor;
    int tamanho;
    
    //método que ajusta a cor da tinta da caneta
    public void ajustarCor(String cor)
    {
        this.cor = cor;
    }
    
    //método que ajusta o tamanho da ponta da caneta
    public void ajustarTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }
    
    //funcionalidades da caneta
    //representadas por métodos
    public void escrever(String txt) 
    {
        System.out.println("Tam: " + this.tamanho);
        System.out.println("Cor: " + this.cor);   
        System.out.println("Texto informado: " + txt);
    }
}

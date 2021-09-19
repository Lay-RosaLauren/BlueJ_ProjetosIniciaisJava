
/**
 * Classe MinhaEx
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 02/08/2021)
 */
public class MinhaEx extends Exception
{
    //construtor
    public MinhaEx() {
        super("Bug da Minha Ex");
    }
    
    //método que mostra algum texto do bug
    public String getBug() {
        return this.getMessage();
    }
}

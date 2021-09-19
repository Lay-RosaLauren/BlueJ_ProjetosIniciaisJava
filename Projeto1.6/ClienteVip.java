
/**
 * ClienteVip
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 01/08/2021)
 */
public class ClienteVip extends Cliente
{   
    //variável que contém o limite do cheque especial
    double limite = 3000;
    
    public ClienteVip(String n, String e, int i) {
        super(n, e, i);
    }
    
    public void ajustarLimite() {
        this.limite += 1000;
    }
    
    public double retornarLimite() {
        return this.limite;
    }
}

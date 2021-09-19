
/**
 * Escreva uma descrição da classe FuncIntegral aqui.
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0  31/07/2021)
 */
public class FuncIntegral extends Funcionario
{
    private double bas;
    
    /**
     * Construtor para objetos da classe FuncIntegral
     */
    public FuncIntegral(String nom, String ema, double bas)
    {
        super(nom, ema);
        this.bas = bas;
    }
    
    //método para realizar o cálculo do salário
    public double calcularSalario() {
        double sal = this.bas - (this.bas * this.TAX);
        return sal;
    }

}

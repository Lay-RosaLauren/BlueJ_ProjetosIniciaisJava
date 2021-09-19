
/**
 * Classe que executa um cálculo aritmético
 * conforme os parametros enviados
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0  02/08/2021)
 */
public class Calculadora
{
    public static double executar(double n1,double n2, String op) throws MinhaEx {
        double result = 0;
        
        if (n2 == 7)
            throw new MinhaEx();
            
        if ( op.equals("+") )
            result = n1 + n2;
        if ( op.equals("-") )
            result = n1 - n2;
        if ( op.equals("*") )
            result = n1 * n2;
        if ( op.equals("/") )
            result = n1 / n2;
            
        return result;    
    }
}


/**
 * Sistema que faz uma operação aritimética simples
 * - Recebe dois números e um operador e mostra o resultado
 * - CALCULADORA SIMPLEX
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 30/07/2021)
 */
public class Principal
{
    /**
     * Método Principal
     */
    public static void main(String[] args) {
        double n1 = Tela.retornaDbl("Informe um valor");
        double n2 = Tela.retornaDbl("Informe outro valor");
        String op = Tela.retornaTxt("Operação: (+, -, *, /)");
        
        double res = Calculadora.exec(n1, n2, op);
        
        Tela.mostraTxt("Resultado: " + res);
    }
}

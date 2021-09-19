
/**
 * Classe TesteNumeros
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 26/07/2021)
 */
public class TesteNumeros
{
    public static void main(String args[])
    {
        // no Java temos as classes que representam os tipos
        //para fazermos conversões etc...
        String snro = "1234";
        int inro = Integer.parseInt(snro);
        float fnro = Float.parseFloat(snro);
        double dnro = Double.parseDouble(snro);
        
        // dá pra fazer o contrário também
        int ival = 9876;
        String sval = Integer.toString(ival);
        
        //e temos a classe "Math" para outras funções aritiméticas
        System.out.println( Math.pow(2,3) );
        System.out.println( Math.sqrt(25) );
        System.out.println( Math.sin(90) );
        System.out.println( Math.E ); //constante
        System.out.println( Math.PI ); //constante
    }
}

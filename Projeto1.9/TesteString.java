
/**
 * Classe TesteString
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 26/07/2021)
 */
public class TesteString
{
    public static void main(String args[])
    {
        //String é uma classe do Java
        //portanto as variáveis são "objetos"
        String texto1 = "texto de teste e coisa e tal";
        String texto2 = new String("outro texto bla bla");
        
        System.out.println( texto1.toUpperCase() );
        System.out.println( texto1.substring(5,10) );
        System.out.println( texto1.equals("asdf") );
        System.out.println( texto1.charAt(15) );
        
        //declaramos um vetor (array) usando colchetes
        //no Java, temos vetor com tipos definidos
        String[] vetor = texto1.split(" ");
        System.out.print( vetor[4] );
    }
}    

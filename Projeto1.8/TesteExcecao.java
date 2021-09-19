
/**
 * Classe TesteExcecao
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 02/08/2021)
 */
public class TesteExcecao
{
    public static void main(String args[]) {
        
        try {
            System.out.println("valor do parâmetro que foi enviado: "+args[0]);
        }
        catch(ArrayIndexOutOfBoundsException bug) {
            System.out.println("Acesso a posição do array que não existe");
        }
        catch(Exception bug) {
            System.out.println("Bug geral: "+ bug.getMessage());
        }
        finally {
            System.out.println("Sempre entra nessa parte do código");
        }
    }
}

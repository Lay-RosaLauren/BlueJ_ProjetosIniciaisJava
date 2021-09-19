
/**
 * classe TesteArray
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 26/07/2021)
 */

import java.util.*;
 
public class TesteArray
{
    public static void main(String args[]) {
    //podemos declarar variáveis para comportar 
    //mais de um valor (array)
    String[] nomes = new String[5];
    nomes[0] = "Fulano";
    nomes[1] = "Beltrano";
    nomes[2] = "Teste";
    
    int[] idades = new int[5];
    idades[0] = 12;
    idades[1] = 23;
    idades[2] = 34;
    
    System.out.println(nomes[1]+" com idade "+idades[1]);
    //--------------------------------------------------
    
    //mas podemos usar uma classe de linguagem para
    //manipulação de vetores de qq coisa...
    ArrayList vetor = new ArrayList();
    vetor.add("Texto de teste");
    vetor.add(1234);
    
    System.out.println("qtd de elementos: " + vetor.size());
    System.out.println(vetor.get(0));
    }
}

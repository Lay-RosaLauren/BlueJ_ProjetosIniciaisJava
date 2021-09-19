
/**
 * Exercício para treinar os recursos vistos até agora
 * - Classificação, organização dos tributos e métodos
 * - E também alguns recursos de linguagem (String, Arrays, etc)
 * 
 * @author (Lay-Rosa Lauren) 
 * @version (1.0 - 30/07/2021)
 */


public class Principal
{
    public static void main(String args[]) {
        //obter os dados que o usuário informa
        int ini = Tela.retornaInt("Informe um nro inteiro");
        int fim = Tela.retornaInt("Informe outro nro inteiro");
    
        //cria o objeto para processamento
        Pares p = new Pares();
        String res = p.retornaNros(ini, fim);
    
        //saida com o resultado
        Tela.mostraTxt(res);
    }
}
    
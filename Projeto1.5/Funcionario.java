
/**
 * Escreva uma descrição da classe Funcionário aqui.
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 31/07/2021)
 */
public abstract class Funcionario
{
    //constante (final) que pode ser acessada
    //dentro da estrutura hierárquica (protected)
    protected final double TAX = 0.10;
    
    //outros atributos com acesso local
    private String nom;
    private String ema;
    
    /**
     * Construtor para objetos da classe Funcionário
     */
    public Funcionario() {
        this.nom = "Vazio";
        this.ema = "vazio@vazio.com";
    }
    
    public Funcionario(String nom, String ema) 
    {
        this.nom = nom;
        this.ema = ema;
    }
    
    //método que ajusta o nome do funcionário
    public void setNome(String nom) {
        this.nom = nom;
    }

    //método que retorna o nome do funcionário
    public String getNome() {
        return this.nom;
    }
    
    //método modelo para ser OBRIGATÓRIAMENTE implementado
    //nas subclasses (classes que herdam Funcionário)
    public abstract double calcularSalario();
}

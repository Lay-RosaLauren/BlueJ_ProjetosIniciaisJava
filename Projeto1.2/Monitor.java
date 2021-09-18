
/**
 * Classe que representa os atributos e métodos 
 * de um Monitor de Computador
 * 
 * @author (Lay-RosaLauren) 
 * @version (1.0 - 25/07/2021)
 */
public class Monitor
{
    //atributos do monitor
    private int reso;
    private String tipo;
    private String sep;
    
    //método construtor - para inicializar os dados do objeto
    public Monitor(){
        this.tipo = "LED";
        this.ajustarReso(1024);
    }
    
    //método que exibe mensagem na tela qdo o monitor eh ligado
    public void ligar() {
        System.out.println("Ligando o monitor... ok");
        System.out.println("");
    }
    
    //método que exibe mensagem na tela qdo o monitor eh desligado
    public void desligar() {
        System.out.println("");
        System.out.println("Desligando... até... MaLuKo!");
    }
    
    //metodo que mostra algo na tela
    public void exibirMsg(String txt) {
        System.out.println("");
        System.out.println(this.sep);
        System.out.println("Resolução atual: " + this.reso);
        System.out.println(txt);
        System.out.println(this.sep);
        System.out.println("");
    }
    
    //métodos auxiliares para ajustar os atributos
    public void ajustarReso(int reso) {
        if(reso != 1024 && reso != 1280 && reso != 1600) {
           this.reso = 1024; 
        }
        else {
            this.reso = reso;
        }
        this.ajustarSep();
    }
    
    //método para ajustar o símbolo que representa a resolução
    private void ajustarSep() {
        String sep = "";
        int qtd = (int) (this.reso/100);
        for (int i=0; i<qtd; i++) {
            sep += "-";
        }
        this.sep = sep;
    }
}

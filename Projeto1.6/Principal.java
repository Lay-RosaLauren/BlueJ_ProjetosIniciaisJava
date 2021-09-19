
  /**
   * Escreva uma descrição da classe Principal aqui.
   * 
   * @author (Lay-RosaLauren) 
   * @version (1.0 - 01/08/2021)
   */
  public class Principal
  {
      public static void main(String s[])
      {
          String res = "sim";
          int opt = 0;
          while (res.equalsIgnoreCase("sim"))
          {
              opt = EntradaSaida.receberInt("1: cad, 2: peq, 3: limite");
              switch(opt) {
                  case 1:
                      Sistema.cadastrarCliente();
                      break;
                  case 2:
                      Sistema.pesquisarCliente();
                      break;
                  case 3:
                      Sistema.aumentarLimite();
                      break;
                  default:
                    EntradaSaida.mostrarTexto("Inválida");
              }
              res = EntradaSaida.receberString("Continuar?");
          }    
      }
 }

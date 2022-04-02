/*
- Atributos

    Tiene como atributo público un entero que indica el número de vidas que le 
quedan al jugador en la partida actual.

- Métodos

    Tiene como método el constructor que acepta un parámetro de tipo entero que
indica el número de vidas iniciales con las que parte el jugador.

    Tiene un método MuestraVidasRestantes que visualiza por pantalla el número 
de vidas que le quedan al jugador en la partida actual.

    Además esta clase tiene también el método main que debe realizar lo siguiente:

    ◦ Crea una instancia de la clase Juego indicando que el número de vidas es 5.

    ◦ Llama al método MuestraVidasRestantes del objeto creado.

    ◦ Resta una vida al valor del atributo con las vidas y vuelve a llamar 
a MuestraVidasRestantes.

    ◦ Crea otra instancia de la clase Juego indicando que el número de vidas 
es también de 5.

    ◦ Llama al método MuestraVidasRestantes de la nueva instancia y luego al 
de la instancia anterior.

 */

/**
 *
 * @author antonio
 */
public class Juego {
  
  public int vidasRestantes;
  
  
  private int vidasIniciales;

  public Juego(int vidasInciales) {
    this.vidasIniciales = vidasInciales;
    this.vidasRestantes = vidasIniciales;
  }

  /**
   * get de la variable de objeto vidas restantes
   * @return las vidas restantes del objeto
   */
  public int MuestraVidasRestantes() {
    return vidasRestantes;
  }
  /**
   * clase pincipal
   * @param args
   */
  
  public static void main(String[] args) {
    //creamos el objeto
    Juego player1 = new Juego(5);
    
    // muestra vidas restantes
    System.out.println("Numero vidas restantes: "+player1.MuestraVidasRestantes());
    
    /**
     * Resta una vida al valor del atributo con las vidas y vuelve a llamar a MuestraVidasRestantes.
     */
    String result = String.format("Restando 1 el total vidas queda a %d", player1.MuestraVidasRestantes() -1);
    System.out.println(result);
    
    
    /**
     * Crea otra instancia de la clase Juego indicando que el número de vidas es también de 5
     */
    
    Juego player2 = new Juego(5);
    
    /**
     * Llama al método MuestraVidasRestantes de la nueva instancia y luego al de la instancia anterior.
     */
    
    player1.MuestraVidasRestantes();
    
    System.out.println("Jugador1 "+player1.MuestraVidasRestantes());
    System.out.println("Jugador2 "+player2.MuestraVidasRestantes());
    
  }
  
}

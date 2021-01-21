package fraccion;

/**
 * 2. Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
 *
 * �Contruir un objeto Fraccion pas�ndole el numerador y el denominador.
 * �Obtener la fracci�n como cadena de caracteres.
 * �Obtener y modificar numerador y denominador. No se puede dividir por cero.
 * �Obtener resultado de la fracci�n (n�mero real).
 * �Multiplicar la fracci�n por un n�mero (el resultado es otro objeto fracci�n).
 * �Multiplicar, sumar y restar fracciones (el resultado es otro objeto fracci�n).
 * �Simplificar la fracci�n (cambia el objeto actual).
 * 
 * @author Andrea Sol�s Tejada
 *
 */

public class Fraccion {
  
  // Campos.
  private int numerador;
  private int denominador;
  
  /**
   * Constructor de la clase Fraccion.
   * 
   * @param numerador
   * @param denominador
   */
  public Fraccion(int numerador, int denominador) {
    if (denominador == 0) {
      System.err.println("No se puede dividir por 0.");
      System.exit(0);
    } 
    else {
      this.numerador = numerador;
      this.denominador = denominador;
    }
  }

  //Getters y setters.
  /**
   * @return the numerador
   */
  public int getNumerador() {
    return numerador;
  }

  /**
   * @return the denominador
   */
  public int getDenominador() {
    return denominador;
  }

  /**
   * @param numerador the numerador to set
   */
  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  /**
   * @param denominador the denominador to set
   */
  public void setDenominador(int denominador) {
    if (denominador != 0) {
      this.denominador = denominador;
    } else {
      System.err.println("No se puede dividir por cero. El denominador no se ha cambiado");
    }
  }
  
  // M�todos.
  
  /**
   * Obtener el resultado de la fracci�n en n�mero real.
   * 
   * @return numerador entre denominador
   */
  public double resultadoFraccion() {
    return (double) (this.numerador / this.denominador);
  }
  
  /**
   * Multiplica la fracci�n por un n�mero.
   * 
   * @param numero
   */
  public Fraccion multiplicaNumero(int numero) {
    return new Fraccion (this.numerador * numero, this.denominador);
  }
  
  /**
   * Multiplica la fracci�n por otra fracci�n.
   * 
   * @param otro
   * @return new Fraccion
   */
  public Fraccion multiplicarFraccion(Fraccion otro) {
    return new Fraccion(this.numerador * otro.numerador, this.denominador * otro.denominador);
  }
  
  /**
   * Suma la fracci�n por otra fracci�n.
   * 
   * @param otro
   * @return new Fraccion
   */
  public Fraccion sumarFraccion(Fraccion otro) {
    return new Fraccion(this.numerador * otro.denominador + this.denominador * otro.numerador,
                        this.denominador * otro.denominador);
  }
  
  /**
   * Resta la fracci�n por otra fracci�n.
   * 
   * @param otro
   * @return new Fraccion
   */
  public Fraccion restarFraccion(Fraccion otro) {
    return this.sumarFraccion(otro.multiplicaNumero(-1));
  }
  
  /**
   * Hago el m�nimo com�n divisor para poder usarlo para simplificar la fracci�n.
   * 
   * @return
   */
  private int mcd() {
    int u = Math.abs(this.numerador);
    int v = Math.abs(this.denominador);
    
    if (v == 0) {
      return u;
    }
    
    int resto;
    
    while (v != 0) {
      resto = u % v;
      u = v;
      v = resto;
    }
    return u;
  }
  
  /**
   * Simplifica la fracci�n.
   * 
   * @return new Fraccion
   */
  public Fraccion simplificarFraccion() {
    return new Fraccion(this.numerador / mcd(), this.denominador / mcd());
  }

  /**
   * Metodo toString para sacar una salida formateada.
   * @return Salida formateada
   */
  @Override
  public String toString() {
    return (this.numerador + "/" + this.denominador);
  }
  
  

}

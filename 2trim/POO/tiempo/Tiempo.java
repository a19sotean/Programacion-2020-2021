package tiempo;

/**
 * 1. Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
 *
 * t = Tiempo(1, 20, 30)
 *
 * donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. 
 * 
 * Crea métodos para:
 * 
 * Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
 * Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).
 * Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author Andrea Solís Tejada
 *
 */

public class Tiempo {
  
  // Campos
  private int horas;
  private int minutos;
  private int segundos;
  
  /**
   * Constructor de la clase Tiempo.
   * 
   * @param horas
   * @param minutos
   * @param segundos
   */
  Tiempo(int horas, int minutos, int segundos) {
    // Creo una variable seg donde convertiré todo a segundos.
    int seg = horas * 3600 + minutos * 60 + segundos;
    // Vuelvo a pasar todo a horas, minutos y segudos.
    this.horas = seg / 3600;
    this.minutos = (seg % 3600) / 60;
    this.segundos = (seg % 3600) % 60;
  }
  // También se podría hacer un método normalizar en lugar de ponerlo en el constructor.

  // Getters. Como mis atributos son privados, necesito los getters para poder usarlos.
  /**
   * @return the horas
   */
  public int getHoras() {
    return horas;
  }

  /**
   * @return the minutos
   */
  public int getMinutos() {
    return minutos;
  }

  /**
   * @return the segundos
   */
  public int getSegundos() {
    return segundos;
  }
  
  // Métodos
  /**
   * Suma a este objeto otro objeto que pasamos como parámetro y lo devuelve.
   * @param otro
   * @return new Tiempo
   */
  public Tiempo suma(Tiempo otro) {
    return new Tiempo(this.horas + otro.horas, this.minutos + otro.minutos, this.segundos + otro.segundos);
    }
  
  /**
   * Resta a este objeto otro objeto que pasamos como parámetro y lo devuelve.
   * @param otro
   * @return new Tiempo
   */
  public Tiempo resta(Tiempo otro) {
    return new Tiempo(this.horas - otro.horas, this.minutos - otro.minutos, this.segundos - otro.segundos);
    }
   
  /**
   * Suma segundos a este objeto.
   * @param segundos
   */
  public void sumarSegundos(int segundos) {
    // Creo una variable auxiliar
    Tiempo auxiliar = new Tiempo(this.horas, this.minutos, this.segundos + segundos);
    
    this.horas = auxiliar.horas;
    this.minutos = auxiliar.minutos;
    this.segundos = auxiliar.segundos;
  }
  
  /**
   * Resta segundos a este objeto.
   * @param segundos
   */
  public void restarSegundos(int segundos) {
    this.sumarSegundos(-1 * segundos);
  }
  
  /**
   * Suma minutos a este objeto.
   * @param minutos
   */
  public void sumarMinutos(int minutos) {
    this.sumarSegundos(60 * minutos);
  }
  
  /**
   * Resta minutos a este objeto.
   * @param minutos
   */
  public void restarMinutos(int minutos) {
    this.sumarSegundos(-60 * minutos);
  }
  
  /**
   * Suma horas a este objeto.
   * @param horas
   */
  public void sumarHoras(int horas) {
    this.sumarSegundos(3600 * horas);
  }
  
  /**
   * Restar horas a este objeto.
   * @param horas
   */
  public void restarHoras(int horas) {
    this.sumarSegundos(-3600 * horas);
  }
  
  /**
   * Metodo toString para sacar una salida formateada.
   * @return Salida formateada
   */
  public String toString() {
    return (this.horas + "h " + this.minutos + "m " + this.segundos + "s");
  }
  

}

package tiempo;
import java.util.Scanner;

public class PruebaTiempo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Pido el primer horario.
    System.out.println("Dime el primer horario");
    System.out.print("Dime las horas: ");
    int h1 = s.nextInt();
    System.out.print("Dime los minutos: ");
    int m1 = s.nextInt();
    System.out.print("Dime los segundos: ");
    int s1 = s.nextInt();
    
    // Creo los nuevos tiempos.
    Tiempo t1 = new Tiempo(h1, m1, s1);
    Tiempo t2 = new Tiempo(3, 30, -13);
    
    // Pruebo el m�todo toString.
    System.out.println("El primer tiempo es: " + t1.toString());
    System.out.println("El segundo tiempo es: " + t2.toString());
    
    // Pruebo el m�todo suma.
    System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
    
    // Pruebo el m�todo resta.
    System.out.println(t1 + " - " + t2 + " = " + t1.resta(t2));
    
    // Pruebo el m�todo sumarSegundos.
    System.out.print("�Cu�ntos segundos quieres sumar? ");
    int segASumar = s.nextInt();
    t1.sumarSegundos(segASumar);
    System.out.println(t1);
    
    // Pruebo el m�todo restarSegundos.
    System.out.print("�Cu�ntos segundos quieres restar? ");
    int segARestar = s.nextInt();
    t1.restarSegundos(segARestar);
    System.out.println(t1);
    
    // Pruebo el m�todo sumarMinutos.
    System.out.print("�Cu�ntos minutos quieres sumar? ");
    int minASumar = s.nextInt();
    t1.sumarMinutos(minASumar);
    System.out.println(t1);
    
    // Pruebo el m�todo restarSegundos.
    System.out.print("�Cu�ntos minutos quieres restar? ");
    int minARestar = s.nextInt();
    t1.restarMinutos(minARestar);
    System.out.println(t1);
    
    // Pruebo el m�todo sumarMinutos.
    System.out.print("�Cu�ntas horas quieres sumar? ");
    int horASumar = s.nextInt();
    t1.sumarHoras(horASumar);
    System.out.println(t1);
    
    // Pruebo el m�todo restarSegundos.
    System.out.print("�Cu�ntas horas quieres restar? ");
    int horARestar = s.nextInt();
    t1.restarHoras(horARestar);
    System.out.println(t1);

  }

}

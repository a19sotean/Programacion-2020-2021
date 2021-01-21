package fraccion;
import java.util.Scanner;

public class PruebaFraccion {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Pido una fracción.
    System.out.print("Dime el numerador de una fracción: ");
    int num = s.nextInt();
    System.out.print("Dime el denominador de una fracción: ");
    int den = s.nextInt();
    
    // Creo el objeto fracción.
    Fraccion f1 = new Fraccion(num, den);
    
    // Obtener numerador y denominador.
    System.out.print("El valor del numerador es: " + f1.getNumerador() + "\n");
    System.out.print("El valor del denominador es: " + f1.getDenominador() + "\n");
    System.out.println("La fracción es: " + f1.toString());
    
    // Modificar numerador y denominador.
    System.out.print("El nuevo numerador de la fracción " + f1 + " será: ");
    f1.setNumerador(s.nextInt());
    System.out.print("El nuevo denominador de la fracción " + f1 + " será: ");
    f1.setDenominador(s.nextInt());
    System.out.println("La nueva fracción es: " + f1);
    
    // Obtener resultado de la fracción (número real).
    System.out.println("El resultado de la fracción es: " + f1.resultadoFraccion());
    
    // Multiplica la fracción por un número.
    System.out.print("Multiplica la fracción por el número entero: ");
    int numero = s.nextInt();
    System.out.print("El resultado de multiplicar la fracción " + f1.toString() + " con el número " 
    + numero + " es: " + f1.multiplicaNumero(numero));
    
    // Creo otra fracción para operar.
    System.out.println("Creamos otra fracción.");
    System.out.print("Dime el numerador de la otra fracción: ");
    int num2 = s.nextInt();
    System.out.print("Dime el denominador de la otra fracción: ");
    int den2 = s.nextInt();
    Fraccion f2 = new Fraccion(num2, den2);
    System.out.println("La otra fracción es: " + f2.toString());
    
    // Multiplica la fracción por otra fracción.
    System.out.println("La multiplicación de " + f1 + " x " + f2 + " es = " + f1.multiplicarFraccion(f2));
    
    // Suma la fracción con otra fracción.
    System.out.println("La suma de " + f1 + " + " + f2 + " es = " + f1.sumarFraccion(f2));
    
    // Resta la fracción con otra fracción.
    System.out.println("La resta de " + f1 + " - " + f2 + " es = " + f1.restarFraccion(f2));
    
    // Simplifica la fracción.
    System.out.println("La simplificación de la fracción " + f1 + " es = " f1.simplificarFraccion());
  }

}

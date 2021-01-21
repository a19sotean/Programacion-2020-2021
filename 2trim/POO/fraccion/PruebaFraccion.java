package fraccion;
import java.util.Scanner;

public class PruebaFraccion {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Pido una fracci�n.
    System.out.print("Dime el numerador de una fracci�n: ");
    int num = s.nextInt();
    System.out.print("Dime el denominador de una fracci�n: ");
    int den = s.nextInt();
    
    // Creo el objeto fracci�n.
    Fraccion f1 = new Fraccion(num, den);
    
    // Obtener numerador y denominador.
    System.out.print("El valor del numerador es: " + f1.getNumerador() + "\n");
    System.out.print("El valor del denominador es: " + f1.getDenominador() + "\n");
    System.out.println("La fracci�n es: " + f1.toString());
    
    // Modificar numerador y denominador.
    System.out.print("El nuevo numerador de la fracci�n " + f1 + " ser�: ");
    f1.setNumerador(s.nextInt());
    System.out.print("El nuevo denominador de la fracci�n " + f1 + " ser�: ");
    f1.setDenominador(s.nextInt());
    System.out.println("La nueva fracci�n es: " + f1);
    
    // Obtener resultado de la fracci�n (n�mero real).
    System.out.println("El resultado de la fracci�n es: " + f1.resultadoFraccion());
    
    // Multiplica la fracci�n por un n�mero.
    System.out.print("Multiplica la fracci�n por el n�mero entero: ");
    int numero = s.nextInt();
    System.out.print("El resultado de multiplicar la fracci�n " + f1.toString() + " con el n�mero " 
    + numero + " es: " + f1.multiplicaNumero(numero));
    
    // Creo otra fracci�n para operar.
    System.out.println("Creamos otra fracci�n.");
    System.out.print("Dime el numerador de la otra fracci�n: ");
    int num2 = s.nextInt();
    System.out.print("Dime el denominador de la otra fracci�n: ");
    int den2 = s.nextInt();
    Fraccion f2 = new Fraccion(num2, den2);
    System.out.println("La otra fracci�n es: " + f2.toString());
    
    // Multiplica la fracci�n por otra fracci�n.
    System.out.println("La multiplicaci�n de " + f1 + " x " + f2 + " es = " + f1.multiplicarFraccion(f2));
    
    // Suma la fracci�n con otra fracci�n.
    System.out.println("La suma de " + f1 + " + " + f2 + " es = " + f1.sumarFraccion(f2));
    
    // Resta la fracci�n con otra fracci�n.
    System.out.println("La resta de " + f1 + " - " + f2 + " es = " + f1.restarFraccion(f2));
    
    // Simplifica la fracci�n.
    System.out.println("La simplificaci�n de la fracci�n " + f1 + " es = " f1.simplificarFraccion());
  }

}

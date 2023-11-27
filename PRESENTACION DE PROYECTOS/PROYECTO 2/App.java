import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double a = 0, b = 0, c = 0;
        double ecu1, ecu2;
        int intentos;

        System.out.println("Se necesita la a, b, c");
  // for de intentos para validar que no entre negativos ni 0
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Digite la a: ");
            try {
                a = lector.nextDouble();
                if (a < 0.1) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                lector.next();
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            for (intentos = 0; intentos < 3; intentos++) {
                System.out.print("Digite la b: ");
                try {
                    b = lector.nextDouble();
                    if (b < 0.1) {
                        System.out.println("No se aceptan valores menores a 0.1");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debe ingresar un número válido.");
                    lector.next();
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {

                for (intentos = 0; intentos < 3; intentos++) {
                    System.out.print("Digite la c: ");
                    try {
                        c = lector.nextDouble();
                        if (c < 0.1) {
                            System.out.println("No se aceptan valores menores a 0.1");
                        } else {
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un número válido.");
                        lector.next();
                    }
                }

                if (intentos == 3) {
                    System.out.println("Demasiados intentos fallidos");
                } else {
                    //objeto que llama a la clase calcular raiz
                    CalcularRaiz calculadora = new CalcularRaiz();

                    double discriminante = calculadora.calcularDiscriminante(a, b, c);

                    if (calculadora.tieneRaices(discriminante)) {
                        ecu1 = calculadora.calcularRaiz1(a, b, discriminante);
                        ecu2 = calculadora.calcularRaiz2(a, b, discriminante);
                        System.out.println("Las raíces son: x1 = " + ecu1 + ", x2 = " + ecu2);
                    } else if (calculadora.tieneRaiz(discriminante)) {
                        double x = calculadora.calcularUnicaRaiz(a, b);
                        System.out.println("La única raíz es: x = " + x);
                    } else {
                        System.out.println("No existen soluciones reales para la ecuación");
                    }
                }
            }
        }
        // Cierre del scanner
        lector.close(); 
    }
}
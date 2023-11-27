import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos;
        int numJugadores = 0;

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
            try {
                numJugadores = lector.nextInt();
                if (numJugadores < 0) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                lector.next();
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            Juego juego = new Juego(numJugadores);
            while (!juego.finJuego()) {
                juego.ronda();
            }
        }
        
        lector.close(); 
    }
}
import java.util.Scanner;

public class Juego {
    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego(int numJugadores) {
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }
        this.jugadores = new Jugador[numJugadores];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            
            int id;
            while (true) {
                System.out.print("Ingrese el ID para " + nombre + ": ");
                if (scanner.hasNextInt()) {
                    id = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (id >= 0) {
                        break; 
                    } else {
                        System.out.println("El ID no puede ser negativo. Intente de nuevo.");
                    }
                } else {
                    System.out.println("Debe ingresar un número entero para el ID. Intente de nuevo.");
                    scanner.nextLine(); 
                }
            }
            
            this.jugadores[i] = new Jugador(id, nombre);
        }
        scanner.close();

        this.revolver = new Revolver();
    }

    public boolean finJuego() {
        for (Jugador jugador : jugadores) {
            if (!jugador.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            jugador.disparar(revolver);
            if (!jugador.estaVivo()) {
                break;
            }
            revolver.siguienteBala();
        }
    }
}
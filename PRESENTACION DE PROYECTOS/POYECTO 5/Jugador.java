
public class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.vivo = true;
    }

    public void disparar(Revolver revolver) {
        if (revolver.disparar()) {
            this.vivo = false;
            System.out.println(this.nombre + " se dispara y muere.");
        } else {
            System.out.println(this.nombre + " se dispara y sigue vivo.");
        }
    }

    public boolean estaVivo() {
        return this.vivo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }
}

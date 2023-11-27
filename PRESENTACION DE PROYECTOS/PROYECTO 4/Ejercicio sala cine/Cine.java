public class Cine {
private final int fila;
private final int columna;
private String[][] sala;
private int ticket;
private int ingresoActual;
public Cine (int fila, int columna) {
    this.fila = fila;
    this.columna = columna;
    this.sala = new String[fila + 1][columna + 1];
    this.ticket = 0;
    
    
 }

 public void llenarSalaPorDefecto() {
    for (int i= 0; i < sala.length; i++) {
        for(int j = 0; j < sala[0].length; j++) {
            if (i == 0 && j == 0) sala[i][j] = " ";
            else if (i == 0) sala[i][j] = String.valueOf(j);
            else if (j == 0) sala[i][j] = String.valueOf(i);
            else sala[i][j] = "\033[32mD\33[0m";

        }
    }
 }

 public void imprimirSala() {
    System.out.println("\n Sala de cine: \n");
    for (String[] asientos : sala) {
        for (int j = 0; j < sala[0].length; j++) {
            System.out.print(asientos[j] + " ");

        }
        System.out.println("\n");
    }
}

    public boolean verificarAsiento(int comprarFila,int comprarColumna ) {
        boolean verificar = comprarFila > fila || 
                            comprarColumna > columna ||
                            comprarFila == 0 || comprarColumna == 0;
        if (verificar) {
            System.out.println("Entrada incorrecta");
            return false;
        } else if (sala[comprarFila][comprarColumna].equals("O")) {
            System.out.println("Este asiento esta ocupado");
            return false;

        } 
        return true;
    }

    public void comprarBoleto(int comprarFila, int comprarColumna) {
        int precio = 10;
        ticket += 1;
        ingresoActual += precio;
        sala[comprarFila][comprarColumna] = "O";
        System.out.println("\nPrecio del boleto: $" +precio);
    }
}


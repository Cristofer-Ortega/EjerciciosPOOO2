import java.util.Scanner;
public class App {
    final static Scanner scanner = new Scanner(System.in);
    static Cine cine;

    private static void comprarBoleto() {
        boolean flag;
        int comprarFila;
        int comprarColumna;
        do {
            System.out.println("\nIngresa un numero de fila");
            comprarFila = scanner.nextInt();
            System.out.println("Ingresa un numero de columna");
            comprarColumna = scanner.nextInt();
            flag = cine.verificarAsiento(comprarFila, comprarColumna);
        } while (!flag);

        cine.comprarBoleto(comprarFila, comprarColumna);
    } 
    
    public static void main(String[] args) {

        String menu = "\n1. Ver Asientos\n" +
                      "2.   Comprar boletos\n" +
                      "3.   Estadisticas\n" +
                      "4.   Salir";
        System.out.println("\nSe creara una sala de cine, porfavor ingresar : \n");
        System.out.println("Ingresar filas");
        int filas = scanner.nextInt();
        System.out.println("Ingresar columnas");
        int columnas = scanner.nextInt();
        Cine cine =new Cine(filas,columnas );
        cine.llenarSalaPorDefecto();
        int opcion;

        do {
            System.out.println(menu);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                cine.imprimirSala();
                    
                    break;
            
                case 2:
                comprarBoleto();
                
                    break;
                case 3:
                    break;

                case 4:
                    break;
                    
                default:
                System.out.println("Opcion no valida");

                   break;
            }
        } while (opcion != 4);
    }
}

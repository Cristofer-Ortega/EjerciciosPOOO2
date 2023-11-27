import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
       Libro libro = new Libro();
       System.out.print("Ingrese el título del libro: ");
       String titulo = lector.nextLine();
       libro.establecerTitulo(titulo);
       
       System.out.print("Ingrese el ISBN o código de barras del libro: ");
       int intentosISBN = 0;
       int ISBN = -1;
       while (intentosISBN < 3) {
           try {
               ISBN = Integer.parseInt(lector.nextLine());
               if (ISBN < 0) {
                   System.out.println("El ISBN no puede ser negativo.");
               } else {
                   libro.establecerISBN(ISBN);
                   break;
               }
           } catch (NumberFormatException e) {
               System.out.println("Ingrese un número válido para el ISBN.");
           }
           intentosISBN++;
       }
       
       System.out.print("Ingrese el nombre del autor del libro: ");
       String autor = lector.nextLine();
       libro.establecerAutor(autor);
       
       System.out.print("Ingrese el número de páginas del libro: ");
       int intentosPaginas = 0;
       int paginasNum = -1;
       while (intentosPaginas < 3) {
           try {
               paginasNum = Integer.parseInt(lector.nextLine());
               if (paginasNum < 0) {
                   System.out.println("El número de páginas no puede ser negativo.");
               } else {
                   libro.establecerPaginas(paginasNum);
                   break;
               }
           } catch (NumberFormatException e ) {
               System.out.println("Ingrese un número válido para las páginas.");
           }
           intentosPaginas++;
       }
       
        System.out.println("El libro"+ " " +libro.mostrarTitulo()+" "+  "con ISBN"+" "+ libro.mostrarISBN()+" "+ "creado por el autor" +" "+libro.mostrarAutor() +" " +"tiene"+" "+ libro.mostrarPaginas()+" "+" páginas.");
        
    }
}
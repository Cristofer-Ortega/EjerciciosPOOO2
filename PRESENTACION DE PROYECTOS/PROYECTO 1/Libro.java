public class Libro {
    //Atributos
    private String titulo;
    private int ISBN;
    private String autor;
    private int paginas;
    
    
    //Metodos getters y setters
    //Los metodos getters son para mostrar los valores de los atributos

    public Libro() {
    }

    public String mostrarTitulo() {
        return titulo;
    }

    public int mostrarISBN() {
        return ISBN;
    }

    public String mostrarAutor() {
        return autor;
    }

    public int mostrarPaginas() {
        return paginas;
    }
    //Los metodos setters son para modificar los valores de los atributos 
    

    public void establecerTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void establecerISBN(int iSBN) {
        this.ISBN = iSBN;
    }

    public void establecerAutor(String autor) {
        this.autor = autor;
    }

    public void establecerPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
    

     
   


       
   
}

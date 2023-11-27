public class Persona {
    String nombre;
    int edad;
    char sexo;
//contructor principal
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
  // metodo boolean que devuelve un true si esta disponible el profesor
    public boolean estaDisponible() {
        return true;
    }
}
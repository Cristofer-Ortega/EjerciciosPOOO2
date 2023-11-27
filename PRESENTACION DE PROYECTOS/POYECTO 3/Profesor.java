public class Profesor extends Persona {
    String asignatura;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
       // super clase con los atributos de profesor 
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
    }

    @Override
    // devuelve un true si el profesor esta disponible
    public boolean estaDisponible() {
        return true;
    }
}
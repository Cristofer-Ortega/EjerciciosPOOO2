public class Estudiante extends Persona {
    double calificacion;
    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
       // super clase con los atributos de estudiantes
        super(nombre, edad, sexo);
    
        this.calificacion = calificacion;
    }

    @Override
    public boolean estaDisponible() {
        return true;
    }
}
public class Aula {
    int identificador;
    int maxEstudiantes;
    String asignaturaDestinada;
    Profesor profesor;
    Persona[] estudiantes;
    int totalEstudiantes;
  // Metodo contructor 
    public Aula(int identificador, int maxEstudiantes, String asignaturaDestinada, Profesor profesor) {
        this.identificador = identificador;
        this.maxEstudiantes = maxEstudiantes;
        this.asignaturaDestinada = asignaturaDestinada;
        this.profesor = profesor;
        this.estudiantes = new Persona[maxEstudiantes];
        this.totalEstudiantes = 0;
    }
// metodo boolean retorna si el profesor puede impartir clases
    public boolean puedeImpartirseClase() {
        int contador = 0;
        for (Persona estudiante : estudiantes) {
            if (estudiante != null) {
                contador++;
            }
        }
        return contador > (maxEstudiantes / 2) && profesor.estaDisponible();
    }
// metodo int que retorna la cantidad de estudiantes que aprobaron
    public int contarAprobados() {
        int aprobados = 0;
        for (Persona estudiante : estudiantes) {
            if (estudiante instanceof Estudiante) {
                Estudiante e = (Estudiante) estudiante;
                if (e.calificacion >= 5.0) {
                    aprobados++;
                }
            }
        }
        return aprobados;
    }
}
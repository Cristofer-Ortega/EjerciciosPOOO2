// clase para los metodos
public class CalcularRaiz {
 // metodo para calcular el determinante que retorna un valor double
    public double calcularDiscriminante(double a, double b, double c) {
    
        return (b * b) - (4 * a * c);
    }
 // metodo para decir si el discriminante tiene raiz o no

    public boolean tieneRaices(double discriminante) {
        
       
      return discriminante > 0;

    }
  
    public boolean tieneRaiz(double discriminante) {
        return discriminante == 0;
    }
  //metodo para calcular la raiz
    public double calcularRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double calcularRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
  //metodo que calcula si hay una unica raiz
    public double calcularUnicaRaiz(double a, double b) {
        return -b / (2 * a);
    }
}
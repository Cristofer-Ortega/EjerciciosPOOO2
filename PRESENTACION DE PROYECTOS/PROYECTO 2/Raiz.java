public class Raiz {
    private double a;
    private double b;
    private double c;

   
    public Raiz(double a, double b, double c) { // contructor pricipal
        this.a = a;
        this.b = b;
        this.c = c;
    }
   //metodos set y get para las variables a,b y c
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
package Ejercicio9;

import java.util.ArrayList;

public class Main9 {
    //No recordaba como usar las interfaces asi que lo busqué en internet :(
    //Metodo principal
    final double pi = 3.14;

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();

    }

    interface Figura {
        double calcularArea();
        double calcularPerimetro();
        String getNombre();
    }

    class Circulo implements Figura {
        // Atributos
        private double radio;
        // Constructor
        public Circulo(double radio) {
            this.radio = radio;
        }
        //Métodos sobreescritos
        @Override
        public double calcularArea() {
            double area = pi * (this.radio * this.radio);
            return area;
        }

        @Override
        public double calcularPerimetro() {
            double perimetro = 2 * pi * radio;
            return perimetro;
        }

        @Override
        public String getNombre() {
            String nombre = "Circulo";
            return nombre;
        }
    }
    class Rectangulo implements Figura {
        // Atributos
        private double base;
        private double altura;
        // Constructor
        public Rectangulo(double base,double altura) {
            this.base = base;
            this.altura = altura;
        }

        //Métodos sobreescritos
        @Override
        public double calcularArea() {
            double area = this.base * this.altura;
            return area;
        }

        @Override
        public double calcularPerimetro() {
            double perimetro = 2*(this.base*this.altura);
            return perimetro;
        }

        @Override
        public String getNombre() {
            String nombre = "Rectangulo";
            return nombre;
        }
    }
    class TrianguloEquilatero implements Figura {
        // Atributos
        private double lado;
        // Constructor
        public TrianguloEquilatero(double lado) {
            this.lado = lado;
        }

        //Métodos sobreescritos
        @Override
        public double calcularArea() {
            //Acá busqué en internet cómo escribir raices en Java
            //Math.sqrt(3) -> es raíz cuadrada de 3
            double area = (Math.sqrt(3)/4)*(this.lado*this.lado);
            return area;
        }

        @Override
        public double calcularPerimetro() {
            double perimetro = 3*(this.lado);
            return perimetro;
        }

        @Override
        public String getNombre() {
            String nombre = "Triangulo Equilatero";
            return nombre;
        }
    }
}

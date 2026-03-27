package Ejercicio10;

public class Main10 {
    public static void main(String[] args) {
        Automovil a1= new Automovil("Toyota","Corolla",2022,15000,15);
        a1.mostrarInfo();
    }

    interface Electrico {
        String getMarca();

        default void recargar(int minutos){
            System.out.printf("Recargando %s durante %d minutos...",this.getMarca(),minutos);
        }
        default int getNivelBateria(){
            return 0;
        }

    }

    //Clase Vehiculo
    static abstract class Vehiculo {
        //Atributos
        private String marca;
        private String modelo;
        private int anio;
        private double kilometraje;

        //Constructores
        public Vehiculo(String marca, String modelo, int anio, double kilometraje) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.kilometraje = kilometraje;
        }
        //Getters
        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAnio() {
            return anio;
        }

        public double getKilometraje() {
            return kilometraje;
        }
        //Metodo mostrar información
        public void mostrarInfo(){
            System.out.printf("%s %s (%d) | Km: %.1f", this.marca, this.modelo, this.anio, this.kilometraje);
        }

        abstract public double calcularConsumo(double km);
    }

    //Clase Automovil
    static class Automovil extends Vehiculo{
        // Atributo
        private double consumoPorKm;
        // Constructor
        public Automovil(String marca, String modelo, int anio, double kilometraje, double consumoPorKm) {
            super(marca, modelo, anio, kilometraje);
            this.consumoPorKm = consumoPorKm;
        }
        //Metodo para calcular el consumo
        public double calcularConsumo(double km){
            return this.consumoPorKm * km;
        }
        @Override
        public void mostrarInfo(){
            System.out.printf("%s %s (%d) | Km: %.1f | Consumo estimado (100 Km): %.1f\n", this.getMarca(), this.getModelo(), this.getAnio(), this.getKilometraje(),this.calcularConsumo(100));
        }

    }

    //Clase Camion
    static class Camion extends Vehiculo{
        //Atributos
        private double consumoPorKm;
        private double cargaToneladas;
        //Constructor
        public Camion(String marca, String modelo, int anio, double kilometraje, double consumoPorKm, double cargaToneladas) {
            super(marca, modelo, anio, kilometraje);
            this.consumoPorKm = consumoPorKm;
            this.cargaToneladas = cargaToneladas;
        }
        @Override
        public double calcularConsumo(double km) {
            return this.consumoPorKm * km * (1+this.cargaToneladas/10);
        }
        @Override
        public void mostrarInfo(){
            System.out.printf("%s %s (%d) | Km: %.1f | Carga actual: %.1f | Consumo estimado: %.1f",this.getMarca(),this.getModelo(),this.getAnio(),this.getKilometraje(),this.cargaToneladas,this.calcularConsumo(100));
        }
    }

    //Clase Automovil Electrico
    static class AutomovilElectrico extends Automovil implements Electrico{
        // Atributos
        private int nivelBateria;

        //Constructores

        public AutomovilElectrico(String marca, String modelo, int anio, double kilometraje, double consumoPorKm, int nivelBateria) {
            super(marca, modelo, anio, kilometraje, consumoPorKm);
            this.nivelBateria = nivelBateria;
        }
        @Override
        public double calcularConsumo(double km){
            return 0.15 * km;
        }
        @Override
        public void recargar(int minutos){
            this.nivelBateria = minutos/5;
        }

        @Override
        public int getNivelBateria() {
            return  nivelBateria;
        };

        @Override
        public void mostrarInfo(){
            System.out.printf("%s %s (%d) | Km: %.1f | Consumo estimado (100 Km): %.1f | Batería: %d \n", this.getMarca(), this.getModelo(), this.getAnio(), this.getKilometraje(),this.calcularConsumo(100), this.nivelBateria);
        }
    }
}


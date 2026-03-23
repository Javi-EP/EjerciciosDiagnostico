package Ejercicio8;

public class Main8 {
    public static void main(String[] args) {

            //Creamos objeto Empleado y Gerente
            Empleado empleado = new Empleado("Juan Pérez","12.345.678-9",850000);
            Gerente gerente = new Gerente("Ana Torres","98.765.432-1",1700000,200000,"Backend");

            //Invocamos los métodos
            empleado.mostrarInfo();
            gerente.mostrarInfo();

            //Acá almaceno el valor de los salarios respectivos para calcular la diferencia
            double salarioEmpleado = empleado.calcularSalario();
            double salarioGerente = gerente.calcularSalario();

            //Acá busqué en internet por qué no me funcionaba la resta de los doubles
            //pero fue error de sintaxis, ya que estaba junto al String y tiraba error
            System.out.println("\nDiferencia salarial: "+ (salarioGerente-salarioEmpleado));

    }

    //Clase Empleado
    static class Empleado {
        private String nombre;
        private String rut;
        private double salarioBase;

        //Constructor
        public Empleado(String nombre, String rut, double salarioBase) {
            this.nombre = nombre;
            this.rut = rut;
            this.salarioBase = salarioBase;
        }

        //Getters and Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getRut() {
            return rut;
        }

        public void setRut(String rut) {
            this.rut = rut;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        //Metodo para calcular salario
        public double calcularSalario() {
            return this.getSalarioBase();
        }

        //Metodo para mostrar informacion
        public void mostrarInfo() {
            System.out.printf("Empleado: %s | RUT: %s | Salario: $%.1f\n", this.nombre, this.rut, this.salarioBase);
        }
    }

    //Clase Gerente que hereda de Empleado
    static class Gerente extends Empleado {
        //Atributos
        private double bono;
        private String equipo;

        //Constructores

        public Gerente(String nombre, String rut, double salarioBase, double bono, String equipo) {
            super(nombre, rut, salarioBase);
            this.bono = bono;
            this.equipo = equipo;
        }

        //Getters and Setters

        public double getBono() {
            return bono;
        }

        public void setBono(double bono) {
            this.bono = bono;
        }

        public String getEquipo() {
            return equipo;
        }

        public void setEquipo(String equipo) {
            this.equipo = equipo;
        }

        //Sobreescribimos el metodo
        @Override //Utilizamos Override para decirle a Java que esto es sobreescritura
        public double calcularSalario() {
            return this.getSalarioBase() + this.getBono();
        }

        //Sobreescribimos el otro metodo
        @Override
        public void mostrarInfo() {
            System.out.printf("Gerente: %s | RUT: %s | Salario: $%.1f (incluye bono $%.1f) | Equipo: %s", this.getNombre(), this.getRut(), this.calcularSalario(), this.getBono(), this.getEquipo());
        }
    }
}


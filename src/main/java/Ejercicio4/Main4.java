package Ejercicio4;

public class Main4 {
    public static void main(String[] args) {

        //Declaro variables
        int numero = 7;
        int suma = 0; //Variable que almacena la suma de todas las multiplicaciones realizadas

        //Lógica
        System.out.println("=== Tabla del "+numero+" ==="); //Acá busqué bien la sintaxis del for
        for (int i = 1; i <= 12; i++) { //Entiendo la lógica de la incrementalidad con el i++
            suma += i*numero; // Y el límite solicitado, que es 12
            System.out.printf("""
                    %d x %d = %d
                    """,numero,i,numero*i); // Uso formato para el print
        }
        System.out.println("Suma total de la tabla: "+suma);
    }
}
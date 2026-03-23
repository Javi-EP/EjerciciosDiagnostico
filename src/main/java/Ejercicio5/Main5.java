package Ejercicio5;

public class Main5 {
    public static void main(String[] args) {

        //Declaro variables
        int intentos = 0;
        int valorIngresado = 10;

        //Parte A - Condicional + do-while
        if (valorIngresado <= 0){
            do{intentos++;
                System.out.printf("Valor inválido. Intento %d. Ingresa un número mayor a 0.",intentos);
            }while (valorIngresado <= 0); //Ejecución eterna por el literal sin posibilidad de cambio
        }
    //Parte B - Imprimimos la secuencia
        System.out.printf("Valor aceptado: %d",valorIngresado); //Información de validación
        System.out.println("\nIniciando cuenta regresiva desde "+valorIngresado+"...");//Título
        while (valorIngresado > 0){
            System.out.println(valorIngresado);//Impresión de la cuenta atrás, valor por valor
            valorIngresado--; //Acá usé un decrecimiento
        }
    }
}
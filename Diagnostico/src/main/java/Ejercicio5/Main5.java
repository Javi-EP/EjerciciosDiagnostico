void main(String[] args) {
    int intentos = 0;
    int valorIngresado = 10;
//Parte A
    if (valorIngresado <= 0){
        do{intentos++;
            System.out.printf("Valor inválido. Intento %d. Ingresa un número mayor a 0.",intentos);
        }while (valorIngresado <= 0);
    }
//Parte B
    System.out.printf("Valor aceptado: %d",valorIngresado);
    System.out.println("\nIniciando cuenta regresiva desde "+valorIngresado+"...");
    while (valorIngresado > 0){
        System.out.println(valorIngresado);
        valorIngresado--; //Acá usé un decrecimiento
    }
}
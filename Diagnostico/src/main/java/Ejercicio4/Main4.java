void main(String[] args) {
    int numero = 7;
    int suma = 0;
    System.out.println("=== Tabla del "+numero+" ==="); //Acá busqué bien la sintaxis del for
    for (int i = 1; i <= 12; i++) { //Entiendo la lógica de la incrementalidad con el i++
        suma += i*numero; // Y el límite solicitado, que es 12
        System.out.printf("""
                %d x %d = %d
                """,numero,i,numero*i); // Uso formato para el print
    }
    System.out.println("Suma total de la tabla: "+suma);
}
package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        ArrayList<String> carrito = new ArrayList<>();
        boolean salir = true;

        while (salir) {
            int option = menu();
            switch (option) {
                case 1:
                    String producto = agregarProducto();
                    carrito.add(producto);
                    System.out.println("Has agregado: " + producto);
                    break;
                case 6:
                    System.out.println("\nHas salido del programa...");
                    salir = false;
            }
        }
    }

public static int menu(){
    Scanner sc = new Scanner(System.in);
    System.out.println("""
            1. Agregar productos
            2. Mostrar carrito
            3. Buscar productos
            4. Eliminar productos
            5. Mostrar carrito
            6. Salir
            """);
    System.out.println("\nElija una opción...");
    int opt = sc.nextInt();
    return opt;
}

public static String agregarProducto(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Producto a agregar: ");
    String productoAgregar = sc.nextLine();
    return productoAgregar;
}
}


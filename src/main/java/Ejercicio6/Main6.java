package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;
//Sé que no pidió usar Scanner pero por el tipo de ejemplo que da en el github
//para mi era la mejor forma de resolverlo y me ayudó a recordar también
public class Main6 {
    public static void main(String[] args) {

        //Declaramos el ArrayList, boolean y scanner
        ArrayList<String> carrito = new ArrayList<>();
        boolean salir = true;
        Scanner sc = new Scanner(System.in);

        //Añadimos los productos por defecto
        carrito.add("Leche");
        carrito.add("Pan");
        carrito.add("Huevos");
        carrito.add("Mantequilla");
        carrito.add("Jugo");

        //Ejecución de la app - Lógica
        while (salir) {
            int option = menu(sc);
            switch (option) {
                case 1:
                    String producto = agregarProducto(sc);
                    carrito.add(producto);
                    System.out.println("Has agregado: " + producto);
                    break;
                case 2:
                    mostrarCarrito(carrito);
                    break;
                case 3:
                    buscarProducto(carrito,sc);
                    break;
                case 4:
                    eliminarProducto(carrito,sc);
                    break;
                case 5:
                    System.out.println("\nHas salido del programa...");
                    salir = false;
                    break;

            }
        }
    }

    public static int menu(Scanner sc){ //Metodo que muestra el menu y pide opción
        System.out.println("""
                
                1. Agregar productos
                2. Mostrar carrito
                3. Buscar productos
                4. Eliminar productos
                5. Salir
                """);
        System.out.print("Elija una opción: ");
        int opt = sc.nextInt();
        sc.nextLine();//nextLine luego de un nextInt para evitar bugs
        return opt;
    }
    //Para no repetir la creación del objeto tipo Scanner, lo crearé en el main y lo añadiré como parametro en los metodos
    public static String agregarProducto(Scanner sc){ //Metodo para agregar producto
        System.out.print("Producto a agregar: ");
        String productoAgregar = sc.nextLine();
        return productoAgregar;
    }
    public static void mostrarCarrito(ArrayList <String> carrito){
        //Declaramos la variables
        int totalProductos = 0; //Para el total
        int contador = 0; //Para el conteo al mostrarlos

        //Mostramos la lista
        System.out.println("=== Carrito de compras ===");

        //Ciclo for para recorrer el ArrayList
        for (String i : carrito){
            contador++;
            System.out.printf("%d. %s\n", contador, i);
            totalProductos += 1;
        }
        System.out.println("Total productos: "+totalProductos);
    }
    public static void buscarProducto(ArrayList <String> carrito,Scanner sc){
        System.out.print("Producto a buscar: ");
        String productoABuscar = sc.nextLine();
        //Creo variable boolean para la condición
        //Acá inicalizamos siempre en false,y en caso de que exista en el carrito, cambia a true
        boolean existeProducto = false;
        for (String i : carrito){
            if (productoABuscar.equals(i)){
                System.out.println(productoABuscar+" está en el carrito.");
                existeProducto = true;
            }
        }
        if (!existeProducto) //Si es falso, ejecuta esto
            System.out.println(productoABuscar+" no está en el carrito.");
    }
    public static ArrayList<String> eliminarProducto(ArrayList <String> carrito, Scanner sc){
        //Declaramos variables y no es void el metodo ya que retorna el carrito actualizado
        System.out.print("Producto a eliminar: ");
        String productoAEliminar = sc.nextLine();
        //Misma lógica de empezar con boolean false
        boolean existeProducto = false;
        //Recorremos la lista para buscar el producto a eliminar
        for (String i : carrito){
            if (productoAEliminar.equals(i)){
                existeProducto = true;
                System.out.println("Has eliminado: " + productoAEliminar);
                carrito.remove(i);
                return carrito; //Retornamos el carrito para actualizar
            }
        }
        if (!existeProducto){
            System.out.println("No existe el producto a eliminar.");
        }return carrito;
    }
}


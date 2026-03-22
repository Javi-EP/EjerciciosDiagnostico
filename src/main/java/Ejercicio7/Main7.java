package Ejercicio7;

import java.util.HashMap;

public class Main7 {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana López", "+56 9 1234 5678");
        agenda.put("Carlos Ruiz", "+56 9 8765 4321");
        agenda.put("María González", "+56 9 5555 0000");
        agenda.put("Pedro Soto","+56 9 1111 2222");

        mostrarContacto(agenda);

        buscarContacto(agenda);

        actualizarContacto(agenda);

        eliminarContacto(agenda);

        mostrarContacto(agenda);

    }
    public static void mostrarContacto(HashMap agenda){
        System.out.println("=== Agenda de Contactos ===");
        for (Object i : agenda.keySet()){
            System.out.println(i+" -> "+agenda.get(i));
        }
        System.out.println("Total contactos: "+agenda.size());
    }
    public static void buscarContacto(HashMap agenda) {
        String aBuscar = "Carlos Ruiz";

        if (agenda.containsKey(aBuscar)){
            System.out.println("Contacto encontrado -> "+aBuscar+": "+agenda.get(aBuscar));
        } else {
            System.out.println("Contacto no encontrado -> "+aBuscar);
        }
    }
    public static void actualizarContacto(HashMap agenda){
        String aActualizar = "Ana López";
        if (agenda.containsKey(aActualizar)){
            agenda.put(aActualizar, "+56 9 9999 8888");
            System.out.println("Contacto actualizado -> "+aActualizar+": "+agenda.get(aActualizar));
        } else {
            System.out.println("Contacto no encontrado -> "+aActualizar);
        }
    }
    public static void eliminarContacto(HashMap agenda){
        String aEliminar = "Pedro Soto";
        if (agenda.containsKey(aEliminar)){
            agenda.remove(aEliminar);
            System.out.println("Contacto eliminado -> "+aEliminar);
        } else {
            System.out.println("Contacto no encontrado -> "+aEliminar);
        }
    }

}
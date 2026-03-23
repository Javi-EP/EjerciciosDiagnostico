package Ejercicio7;

import java.util.HashMap;
//Este lo hice sin Scanner
public class Main7 {
    public static void main(String[] args) {
        //Declaro la variable HashMap<String,String> y le añado los datos
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana López", "+56 9 1234 5678");
        agenda.put("Carlos Ruiz", "+56 9 8765 4321");
        agenda.put("María González", "+56 9 5555 0000");
        agenda.put("Pedro Soto","+56 9 1111 2222");

    //Ejecuto los métodos realizados
        mostrarContacto(agenda);

        buscarContacto(agenda);

        actualizarContacto(agenda);

        eliminarContacto(agenda);

        mostrarContacto(agenda);

    }
    //Metodo void ya que no retorna nada, solo muestra la agenda de contactos
    public static void mostrarContacto(HashMap <String,String> agenda){
        System.out.println("\n=== Agenda de Contactos ===");
        for (String i : agenda.keySet()){
            System.out.println(i+" -> "+agenda.get(i));
        }
        System.out.println("Total contactos: "+agenda.size());
    }
    //Metodo void por lo mismo
    public static void buscarContacto(HashMap <String,String> agenda) {
        String aBuscar = "Carlos Ruiz";
        //Acá lo estaba haciendo con un if pero busqué información y usé containsKey
        if (agenda.containsKey(aBuscar)){
            System.out.println("\nContacto encontrado -> "+aBuscar+": "+agenda.get(aBuscar));
        } else {
            System.out.println("\nContacto no encontrado -> "+aBuscar);
        }
    }
    //Lo mismo
    public static void actualizarContacto(HashMap <String,String> agenda){
        String aActualizar = "Ana López";
        if (agenda.containsKey(aActualizar)){
            agenda.put(aActualizar, "+56 9 9999 8888");
            System.out.println("\nContacto actualizado -> "+aActualizar+": "+agenda.get(aActualizar));
        } else {
            System.out.println("\nContacto no encontrado -> "+aActualizar);
        }
    }
    public static void eliminarContacto(HashMap <String,String> agenda){
        String aEliminar = "Pedro Soto";
        if (agenda.containsKey(aEliminar)){
            agenda.remove(aEliminar);
            System.out.println("\nContacto eliminado -> "+aEliminar);
        } else {
            System.out.println("\nContacto no encontrado -> "+aEliminar);
        }
    }

}
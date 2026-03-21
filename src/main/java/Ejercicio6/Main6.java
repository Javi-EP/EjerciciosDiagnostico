import java.util.ArrayList;

void main(String[] args) {
    int contador = 1;
    String aBuscar = "Huevos";
    ArrayList<String> carrito = new ArrayList<>();
    carrito.add("Leche");
    carrito.add("Pan");
    carrito.add("Huevos");
    carrito.add("Mantequilla");
    carrito.add("Jugo");
    System.out.println("=== Carrito de compras ===");
    for (String i : carrito){
        System.out.printf("%d. %s\n",contador++,i);
    }
    System.out.printf("Total de productos: %d",contador-1);
    System.out.println("");
    for (String i : carrito){
        if (i.equals(aBuscar)){
            System.out.println(aBuscar+" está en el carrito.");
            return;
        }
    }System.out.println(aBuscar+" no está en el carrito.");
}



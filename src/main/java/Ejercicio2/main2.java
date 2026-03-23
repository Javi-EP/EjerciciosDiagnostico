package Ejercicio2;

public class main2{
    public static void main(String[] args) {

            //Declaro las variables
            int edad = 17;
            String nombre = "Juan Pérez";

            //Condicional
            if (edad >= 18){
                System.out.printf("""
                        Bienvenido/a, %s.
                        Puedes completar el trámite de forma autónoma.
                        """,nombre);
            }else{
                System.out.printf("""
                        Hola, %s.
                        Debes asistir con tu tutor legal para completar este trámite.
                        Tu edad registrada: %d años.
                        """,nombre,edad);
            }
        }
}

void main(String[] args) {
    int edad = 17;
    String nombre = "Juan Pérez";

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

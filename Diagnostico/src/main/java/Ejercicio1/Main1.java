//Entiendo que debo declarar las variables con sus tipos de datos, nombres y literales
//Para cumplir con el Sí/No del resultado del boolean, creé una variable adicional para
//almacenar un String el cual almacenaría el resultado del if del boolean

public static void main(String[] args) {
    String nombre = "Javier Escalona";
    int edad = 27;
    String carrera = "Ingeniería en informática";
    int semestre = 3;
    boolean tieneExperienciaLaboral = false;
    String tieneExperiencia = "";
    if (tieneExperienciaLaboral){
        tieneExperiencia = "Sí";
    } else{
        tieneExperiencia = "No";
    }
//Acá busqué como aplicar el formato en multicadenas, ya que no recordaba exactamente
//    como era
    System.out.printf("""
            === Tarjeta de Presentación ===
            Nombre   : %s
            Edad     : %d
            Carrera  : %s
            Semestre : %d
            Experiencia laboral: %s
            """,nombre,edad,carrera,semestre,tieneExperiencia);
}
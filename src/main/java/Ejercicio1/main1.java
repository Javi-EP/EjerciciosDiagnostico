package Ejercicio1;

public class main1 {
    public static void main(String[] args) {

        //Declaro las variables
        String nombre = "Javier Escalona";
        int edad = 27;
        String carrera = "Ingeniería en informática";
        int semestre = 3;
        boolean tieneExperienciaLaboral = false;
        String tieneExperiencia = "";

        // Condicional
        if (tieneExperienciaLaboral){
            tieneExperiencia = "Sí";
        } else{
            tieneExperiencia = "No";
        }

    //Acá busqué cómo aplicar el formato en multicadenas, ya que no recordaba exactamente
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
}
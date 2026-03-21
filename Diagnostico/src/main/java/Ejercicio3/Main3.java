void main(String[] args) {
    double nota = 4;
    String nombreAlumno = "María González";
    String mensaje = "";
    String estado = "";

    if (nota < 4){
        mensaje = "No aprobaste. Debes rendir el examen de repetición.";
        estado = "Reprobado";
    } else if (nota < 5) {
        mensaje = "Aprobado, pero puedes mejorar.";
        estado = "Suficiente";
    } else if (nota < 6) {
        mensaje = "Buen trabajo, sigue así.";
        estado = "Bueno";
    } else if (nota <= 7 ){
        mensaje = "¡Felicitaciones! Rendimiento sobresaliente.";
        estado = "Excelente";
    }
//Acá busqué el formato para el double ya que no lo recordaba
    System.out.printf("""
            Alumno  : %s
            Nota    : %.1f
            Estado  : %s
            Mensaje : %s
            """,nombreAlumno,nota,estado,mensaje);
}

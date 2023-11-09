
package practica3.u4u5;

public class Practica3U4U5 {

    public static void main(String[] args) {
     
     double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
             {88.0,76.5,89.0,94.5},
            {70.0, 82.5, 91.0, 87.5},
        };
    
  for (int i = 0; i < calificaciones.length; i++) {
        System.out.println("Promedio del estudiante " + (i + 1) + ": " + promedioEstudiante(calificaciones[i]));
    }

    for (int i = 0; i < calificaciones[0].length; i++) {
        System.out.println("Promedio de la materia " + (i + 1) + ": " + promedioMateria(calificaciones, i));
    }
}

public static double promedioEstudiante(double[] calificaciones) {
    double suma = 0.0;
    for (double calificacion : calificaciones) {
        suma += calificacion;
    }
    return suma / calificaciones.length;
}

public static double promedioMateria(double[][] calificaciones, int materia) {
    double suma = 0.0;
    for (double[] calificacion : calificaciones) {
        suma += calificacion[materia];
    }
    return suma / calificaciones.length;
}

}






package Disney;

import java.util.Scanner;

public class PeliculaSerie {

    //Atributos de la clase
    String titulo;
    String fecha_creacion;
    int calificacion;
    String personaje;

    //Metodos de la clase
    public void ingresarPeliSerie() {
        Scanner datos = new Scanner(System.in);

        System.out.println("\n INGRESE PELICULA / SERIE");
        
        System.out.println("Titulo: ");
        titulo = datos.nextLine();

        System.out.println("Fecha Creacion (AA/MM/YYYY): ");
        fecha_creacion = datos.nextLine();

        System.out.println("Calificacion:");
        calificacion = datos.nextInt();
        
        String saltoDeLinea = datos.nextLine();

        System.out.println("Personaje: ");
        personaje = datos.nextLine();

    }

    public void mostrarPeliSerie() {
        System.out.println("\n PELICULA / SERIE");
        System.out.println("Titulo: " + titulo);
        System.out.println("Fecha de creacion: " + fecha_creacion);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("Personaje asociado: " + personaje);
    }

}

package Disney;

import java.util.Scanner;

public class Genero {

    //Atributos de la clase
    String tipo;
    String peli_serie;

    //Metodos de la clase
    public void ingresarGenero() {

        Scanner datos = new Scanner(System.in);

        System.out.println("\n INGRESE GENERO");

        System.out.println("Tipo de Genero: ");
        tipo = datos.nextLine();

        System.out.println("Palicula / Serie: ");
        peli_serie = datos.nextLine();

    }

    public void mostrarGenero() {
        System.out.println("\n GENERO PELICULA / SERIE");
        System.out.println("Tipo de Genero: " + tipo);
        System.out.println("Pelicula / Serie asociada: " + peli_serie);
    }
}

package Disney;

import java.util.Scanner;

public class Personaje {

    //Atributos de la clase
    String nombre;
    int edad;
    int peso;
    String historia;
    String peli_serie;

    //Metodos de la clase
    public void ingresarPersonaje() {

        Scanner datos = new Scanner(System.in);
        
        System.out.println("\n INGRESE PERSONAJE");

        System.out.println("Nombre del Personaje: ");
        nombre = datos.nextLine();

        System.out.println("Edad del Personaje: ");
        edad = datos.nextInt();

        System.out.println("Peso del Personaje: ");
        peso = datos.nextInt();

        String saltoDeLinea = datos.nextLine();

        System.out.println("Historia del Personaje: ");
        historia = datos.nextLine();

        System.out.println("Pelicula / Serie que protagoniza: ");
        peli_serie = datos.nextLine();

    }

    public void mostrarPersonaje() {
        System.out.println("\n DATOS DEL PERSONAJE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Historia: " + historia);
        System.out.println("Pelicula / Serie asociada: " + peli_serie);
    }

}

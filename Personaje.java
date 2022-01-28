package Disney;

public class Personaje {

    //Atributos de la clase
    String nombre;
    int edad;
    int peso;
    String historia;
    String peli_serie;

    //Metodos de la clase
    public void mostrarPersonaje() {
        System.out.println("\n Nombre: " + nombre);
        System.out.println("\n Edad: " + edad);
        System.out.println("\n Peso: " + peso);
        System.out.println("\n Historia: " + historia);
        System.out.println("\n Pelicila / Serie asociada: " + peli_serie);
    }

}

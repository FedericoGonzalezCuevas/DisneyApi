package Disney;

public class PeliculaSerie {

    //Atributos de la clase
    String titulo;
    int fecha_creacion;
    int calificacion;
    String personaje;

    //Metodos de la clase
    public void mostrarPeliSerie() {
        System.out.println("\n Titulo: " + titulo);
        System.out.println("\n Fecha de creacion: " + fecha_creacion);
        System.out.println("\n Calificacion: " + calificacion);
        System.out.println("\n Personaje asociado: " + personaje);
    }

}

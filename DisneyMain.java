package Disney;

public class DisneyMain {

    public static void main(String[] args) {

        //Metodos para cargar datos
        Personaje personaje1;
        personaje1 = new Personaje();
        personaje1.ingresarPersonaje();

        Genero genero1;
        genero1 = new Genero();
        genero1.ingresarGenero();
        
        PeliculaSerie peliculaserie1;
        peliculaserie1 = new PeliculaSerie();
        peliculaserie1.ingresarPeliSerie();
        
        //Metodos para mostrar datos
        personaje1.mostrarPersonaje();
        genero1.mostrarGenero();
        peliculaserie1.mostrarPeliSerie();

    }

}

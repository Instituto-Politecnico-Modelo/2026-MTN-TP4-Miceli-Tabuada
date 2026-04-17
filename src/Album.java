public class Album {
    private String nombre;
    private Artista artista;
    private int anioLanzamiento;

    public Album(String nombre, Artista artista, int anioLanzamiento) {
        this.nombre = nombre;
        this.artista = artista;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Artista getArtista() {
        return artista;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

}

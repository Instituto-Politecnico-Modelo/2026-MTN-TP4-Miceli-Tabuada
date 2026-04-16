import java.time.LocalDate;

public class Album {
    private String nombre;
    private Artista artista;
    private LocalDate anioLanzamiento;

    public Album(String nombre, Artista artista, LocalDate anioLanzamiento) {
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public LocalDate getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(LocalDate anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
}

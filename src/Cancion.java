import java.time.LocalDateTime;

public class Cancion {
    private String nombre;
    private Album album;
    private Popularidad popularidad;
    private int likes;
    private int dislikes;
    private int reproducciones;
    private LocalDateTime ultimaReproduccion;


    public Cancion(String nombre, Album album, Popularidad popularidad, int likes, int dislikes, int reproducciones) {
        this.nombre = nombre;
        this.album = album;
        this.popularidad = popularidad;
        this.likes = likes;
        this.dislikes = dislikes;
        this.reproducciones = reproducciones;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }
    public Popularidad getPopularidad() {
        return popularidad;
    }
    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getDislikes() {
        return dislikes;
    }
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
    public int getReproducciones() {
        return reproducciones;
    }
    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }
    public LocalDateTime getUltimaReproduccion() {
        return ultimaReproduccion;
    }
    public void setUltimaReproduccion(LocalDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public void reproducir() {
        this.reproducciones++;
        this.ultimaReproduccion = LocalDateTime.now();
        this.popularidad.chequearPopularidadPara(this);
    }
    public String detalleCompleto() {
        return this.popularidad.detalleCompletoPara(this);
    }

    public void cambiarPopularidad(Popularidad p) {
        this.popularidad = p;
    }
}

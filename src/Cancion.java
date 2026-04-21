import java.time.LocalDateTime;

public class Cancion {
    private String nombre;
    private Album album;
    private Popularidad popularidad;
    private int likes;
    private int dislikes;
    private int reproducciones;
    private LocalDateTime ultimaReproduccion;

    public Cancion(String nombre, Album album) {
        this.nombre = nombre;
        this.album = album;
        this.popularidad = new Normal(); //arranca en normal TODA cancion
        this.likes = 0;
        this.dislikes = 0;
        this.reproducciones = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public Album getAlbum() {
        return album;
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
        this.popularidad.chequearPopularidadPara(this);
        this.ultimaReproduccion = LocalDateTime.now();
    }
    public String detalleCompleto() {
        return this.popularidad.detalleCompletoPara(this);
    }
    public void cambiarPopularidad(Popularidad p) {
        this.popularidad = p;
    }
}

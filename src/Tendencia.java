import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tendencia extends Popularidad{
    @Override
    protected String icono() {
        return Icono.FIRE.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getNombre() + " - " + c.getAlbum().getArtista().getNombre() + " (" + c.getAlbum().getNombre() + ")";
    }

    @Override
    public void chequearPopularidadPara(Cancion c) {
        long horasDesdeUltimaVez = ChronoUnit.HOURS.between(c.getUltimaReproduccion(), LocalDateTime.now());
        if (horasDesdeUltimaVez >= 24) {
            c.cambiarPopularidad(new Normal());
        }
    }

}

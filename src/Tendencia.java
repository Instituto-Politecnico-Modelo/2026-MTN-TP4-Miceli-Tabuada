import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tendencia extends Popularidad{

    @Override
    protected String icono() {
        return Icono.FIRE.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getNombre() + " - " + c.getAlbum().getArtista().getNombre() + " (" + c.getAlbum().getNombre() + " - " + c.getAlbum().getAnioLanzamiento() +")";
    }

    private static final long HORAS_MAXIMAS_SIN_REPRODUCCION = 24;
    @Override
    public void chequearPopularidadPara(Cancion c) {
        long horasDesdeUltimaVez = ChronoUnit.HOURS.between(c.getUltimaReproduccion(), LocalDateTime.now());
        if (horasDesdeUltimaVez >= HORAS_MAXIMAS_SIN_REPRODUCCION) {
            c.cambiarPopularidad(new Normal());
        }
    }

}

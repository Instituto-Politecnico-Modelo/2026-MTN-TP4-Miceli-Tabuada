public class Normal extends Popularidad {
    private static int REPRODUCCIONES_MINIMAS_ENAUGE = 1000;
    private int reproduccionesEnEsteMomento;

    public Normal() {
        this.reproduccionesEnEsteMomento = 0;
    }

    @Override
    protected String icono() {
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getAlbum().getArtista().getNombre() + " - " + c.getAlbum().getNombre() + " - " + c.getNombre();
    }

    @Override
    public void chequearPopularidadPara(Cancion c) {
        this.reproduccionesEnEsteMomento++;
        if (this.reproduccionesEnEsteMomento > REPRODUCCIONES_MINIMAS_ENAUGE) {
            c.cambiarPopularidad(new EnAuge());
        }
    }
}

public class Normal extends Popularidad {
    @Override
    protected String icono() {
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getAlbum().getArtista().getNombre() + " - " + c.getAlbum().getNombre() + " - " + c.getNombre();
    }

    private static int REPRODUCCIONES_MINIMAS_ENAUGE = 1000;

    @Override
    public void chequearPopularidadPara(Cancion c) {
        if (c.getReproducciones() > REPRODUCCIONES_MINIMAS_ENAUGE) {
            c.cambiarPopularidad(new EnAuge());
        }
    }
}

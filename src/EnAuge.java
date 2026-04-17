public class EnAuge extends Popularidad{

    @Override
    protected String icono() {
        return Icono.ROCKET.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getAlbum().getArtista().getNombre() + " - " + c.getNombre() + " (" + c.getAlbum().getNombre() + " - " + c.getAlbum().getAnioLanzamiento() + ")";
    }

    private static int REPRODUCCIONES_MINIMAS_TENDENCIA = 50000;
    private static int LIKES_MINIMOS_TENDENCIA = 20000;
    private static int DISLIKES_MAXIMOS_NORMAL = 5000;

    @Override
    public void chequearPopularidadPara(Cancion c) {
        if (c.getReproducciones() > REPRODUCCIONES_MINIMAS_TENDENCIA && c.getLikes() > LIKES_MINIMOS_TENDENCIA) { //falta sacar el hardcodeo
            c.cambiarPopularidad(new Tendencia());
        } else if (c.getDislikes() >= DISLIKES_MAXIMOS_NORMAL) {
            c.cambiarPopularidad(new Normal());
        }
    }

}

public class EnAuge extends Popularidad{
    private static int REPRODUCCIONES_MINIMAS_TENDENCIA = 50000;
    private static int LIKES_MINIMOS_TENDENCIA = 20000;
    private static int DISLIKES_MAXIMOS_NORMAL = 5000;
    private int reproduccionesEnEsteMomento;
    private int likesEnEsteMomento;
    private int dislikesEnEsteMomento;
    @Override
    protected String icono() {
        return Icono.ROCKET.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getAlbum().getArtista().getNombre() + " - " + c.getNombre() + " (" + c.getAlbum().getNombre() + " - " + c.getAlbum().getAnioLanzamiento() + ")";
    }

    @Override
    public void chequearPopularidadPara(Cancion c) {
        this.reproduccionesEnEsteMomento++;
        //aca deberia haber una funcion de dar like y dislike, pero el profe no contempla esto
        if (this.reproduccionesEnEsteMomento > REPRODUCCIONES_MINIMAS_TENDENCIA && c.getLikes() > LIKES_MINIMOS_TENDENCIA) {
            c.cambiarPopularidad(new Tendencia());
        } else if (c.getDislikes() >= DISLIKES_MAXIMOS_NORMAL) {
            c.cambiarPopularidad(new Normal());
        }
    }

}

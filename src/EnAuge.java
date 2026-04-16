public class EnAuge extends Popularidad{

    @Override
    protected String icono() {
        return Icono.ROCKET.texto();
    }

    @Override
    protected String leyenda(Cancion c) {
        return c.getAlbum().getArtista().getNombre() + " - " + c.getNombre() + " (" + c.getAlbum().getNombre() + " - " + c.getAlbum().getArtista().getNombre() + ")";
    }

    @Override
    public void chequearPopularidadPara(Cancion c) {
        if (c.getReproducciones() > 50000 && c.getLikes() > 20000) {
            c.setPopularidad(new Tendencia());
        } else if (c.getDislikes() >= 5000) {
            c.setPopularidad(new Normal());
        }
    }

}

public class EnAuge extends Popularidad{

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
        if (c.getReproducciones() > 50000 && c.getLikes() > 20000) { //falta sacar el hardcodeo
            c.cambiarPopularidad(new Tendencia());
        } else if (c.getDislikes() >= 5000) {
            c.cambiarPopularidad(new Normal());
        }
    }

}

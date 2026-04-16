public class Normal extends Popularidad {
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
        if (c.getReproducciones() > 1000) { //falta sacar el hardcodeo
            c.cambiarPopularidad(new EnAuge());
        }
    }
}

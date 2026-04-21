public abstract class Popularidad {
    public String detalleCompletoPara(Cancion c) {
        return icono() + " - " + leyenda(c);
    }

    protected abstract String icono();
    protected abstract String leyenda(Cancion c);
    public abstract void chequearPopularidadPara(Cancion c);
}
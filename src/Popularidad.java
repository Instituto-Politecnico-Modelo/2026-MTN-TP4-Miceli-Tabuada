public abstract class Popularidad {

    public String detalleCompletoPara(Cancion c) {
        return icono() + " - " + leyenda(c); // Formato: icono - leyenda [cite: 4]
    }

    protected abstract String icono();
    protected abstract String leyenda(Cancion c);
    public abstract void chequearPopularidadPara(Cancion c);
}
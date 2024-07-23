public abstract class Personaje {
    protected String nombre;
    protected String descripcion;
    protected long tamaño;
    protected int poder;
    protected int vida;

    public abstract void desplazarse();
    public abstract void mostrarVida();
    public abstract void mostrarPoder();
}

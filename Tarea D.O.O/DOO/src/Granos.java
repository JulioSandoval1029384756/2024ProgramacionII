public class Granos implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Granos(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Granos de " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

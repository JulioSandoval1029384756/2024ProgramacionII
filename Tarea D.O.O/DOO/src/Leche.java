public class Leche implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Leche(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Leche de " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

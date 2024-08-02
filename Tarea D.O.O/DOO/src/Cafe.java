public abstract class Cafe {
    private String nombre;
    private String tamaño;
    private double precio;

    public Cafe(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public abstract void preparar();
    public void servir() {
        System.out.println("Sirviendo " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
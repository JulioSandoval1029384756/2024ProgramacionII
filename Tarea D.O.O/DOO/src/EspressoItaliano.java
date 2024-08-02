public class EspressoItaliano extends Cafe {
    private int intensidad;

    public EspressoItaliano(String tamaño, double precio, int intensidad) {
        super("Espresso Italiano", tamaño, precio);
        this.intensidad = intensidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + getNombre() + " con intensidad " + intensidad);
    }
}


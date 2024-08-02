public class CafeColombiano extends Cafe {
    private String tipoGrano;

    public CafeColombiano(String tamaño, double precio, String tipoGrano) {
        super("Café Colombiano", tamaño, precio);
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + getNombre() + " con grano " + tipoGrano);
    }
}

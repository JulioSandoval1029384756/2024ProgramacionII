public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo el equipo de tipo " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando el equipo de tipo " + tipo);
    }

    public void reparar() {
        System.out.println("Reparando el equipo de tipo " + tipo);
    }
}

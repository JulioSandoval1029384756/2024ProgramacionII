public class Main {
    public static void main(String[] args) {
        Elfo elfo = new Elfo();
        Humano humano = new Humano();
        Enano enano = new Enano();
        Ogro ogro = new Ogro();
        Duende duende = new Duende();

        elfo.atacar();
        humano.defender();
        enano.mostrarVida();
        ogro.destruir();
        duende.mostrarPoder();
    }
}
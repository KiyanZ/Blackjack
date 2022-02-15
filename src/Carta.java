public class Carta {
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        if (numero < 1 | numero > 13) {
            CartaException();
        }

    }

    private void CartaException() {
        System.out.println("Carta no es valida");
    }

    @Override
    public String toString() {
        return numero + " de " + palo + " , ";
    }
}

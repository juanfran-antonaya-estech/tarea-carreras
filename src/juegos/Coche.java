package juegos;

public class Coche {

    private String nombre;
    private Reloj reloj;
    private int numeroCoche;
    private int vuelta;

    public Coche(String nombre, int numeroCoche, int h, int m, int s) {
        this.nombre = nombre;
        this.numeroCoche = numeroCoche;
        this.reloj = new Reloj(h, m, s);
        this.vuelta = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public int getNumeroCoche() {
        return numeroCoche;
    }

    public int getVuelta() {
        return vuelta;
    }

    public void registrarTiempoDeVuelta(Reloj reloj) {
        for (int i = 0; i < reloj.getTotalSegundos(); i++) {
        this.reloj.sumarSegundo();
        }
        this.vuelta++;
    }

    @Override
    public String toString() {
        return "Coche " + nombre + " (#" + numeroCoche + ") - Vuelta: " + vuelta + ", Tiempo: " + reloj;
    }

}


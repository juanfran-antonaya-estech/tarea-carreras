package juegos;
import juegos.Reloj;

public class Coche {
    private String nombre;
    private Reloj reloj;
    private int vuelta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public Coche(String nombre, int h, int m, int s) {
        this.nombre = nombre;
        this.reloj = new Reloj(h, m, s);
    }

    @Override
    public String toString() {
        return "Coche" + nombre + ": " + reloj;
    }

    public int getVuelta() {
        return vuelta;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public void setVuelta(int vuelta) {
        this.vuelta = vuelta;
    }
}

package juegos;

public class Carrera {

    private Reloj reloj;
    private String estado;
    private Coche[] coches;
    private int vueltas;

    public Carrera(Reloj reloj, Coche[] coches, int vueltas) {
        this.reloj = reloj;
        this.coches = coches;
        this.vueltas = vueltas;
        this.estado = "Pendiente";
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Coche[] getCoches() {
        return coches;
    }

    public void setCoches(Coche[] coches) {
        this.coches = coches;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public void agregarCoche(Coche nuevoCoche) {
        

    }

    public void comenzarCarrera() {
        
        this.estado = "En curso";
    }

    public void registrarTiempoDeVuelta(Coche coche, int tiempo) {
        
    }

    public void finalizarCarrera() {
        
        
        this.estado = "Finalizada";
    }
}

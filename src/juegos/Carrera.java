package juegos;

import java.util.ArrayList;

public class Carrera {

    private Reloj tiempoInicio;
    private boolean estado;
    private ArrayList<Coche> coches;
    private int vueltas;

    public Carrera(Reloj tiempoInicio, int vueltas) {
        this.tiempoInicio = tiempoInicio;
        coches = new ArrayList<>();
        this.vueltas = vueltas;
        this.estado = false;
    }

    public Reloj getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(Reloj tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public boolean isEnCurso() {
        return estado;
    }

    public void setEnCurso(boolean enCurso) {
        this.estado = enCurso;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public void agregarCoche(Coche nuevoCoche) {
        coches.add(nuevoCoche);
    }

    public void cambiarEstadoCarrera() {
        this.estado = !this.estado;
    }

    public void registrarTiempoDeVuelta(Reloj reloj, Coche coche) {
        if (estado) {
            coche.registrarTiempoDeVuelta(reloj);
        } else {
            System.out.println("Error: La carrera no está en curso.");
        }
    }

    public void finalizarCarrera() {
        this.estado = false;
        generarClasificacion();
    }

    private void generarClasificacion() {
        
    }
}

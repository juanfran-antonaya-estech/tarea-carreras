package juegos;

import java.util.Arrays;

public class Carrera {

    private Reloj tiempoInicio;
    private boolean estado;
    private Coche[] coches;
    private int vueltas;

    public Carrera(Reloj tiempoInicio, Coche[] coches, int vueltas) {
        this.tiempoInicio = tiempoInicio;
        this.coches = coches;
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
        if (coches.length < nuevoCoche.getNumeroCoche()) {
            coches[nuevoCoche.getNumeroCoche() - 1] = nuevoCoche;
        } else {
            System.out.println("Error: No hay espacio disponible para agregar el coche.");
        }
    }

    public void comenzarCarrera() {
        this.estado = true;
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

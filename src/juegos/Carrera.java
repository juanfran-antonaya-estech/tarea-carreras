package juegos;

import java.util.Arrays;

public class Carrera {

    private Reloj tiempoInicio;
    private boolean enCurso;
    private Coche[] coches;
    private int vueltas;

    public Carrera(Reloj tiempoInicio, Coche[] coches, int vueltas) {
        this.tiempoInicio = tiempoInicio;
        this.coches = coches;
        this.vueltas = vueltas;
        this.enCurso = false;
    }

    public Reloj getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(Reloj tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public boolean isEnCurso() {
        return enCurso;
    }

    public void setEnCurso(boolean enCurso) {
        this.enCurso = enCurso;
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
        // Verificar si hay espacio disponible en la lista de coches
        if (coches.length < nuevoCoche.getNumeroCoche()) {
            coches[nuevoCoche.getNumeroCoche() - 1] = nuevoCoche;
        } else {
            System.out.println("Error: No hay espacio disponible para agregar el coche.");
        }
    }

    public void comenzarCarrera() {
        this.enCurso = true;
    }

    public void registrarTiempoDeVuelta(Reloj reloj, Coche coche) {
        if (enCurso) {
            coche.registrarTiempoDeVuelta(reloj);
        } else {
            System.out.println("Error: La carrera no está en curso.");
        }
    }

    public void finalizarCarrera() {
        this.enCurso = false;
        generarClasificacion();
    }

    private void generarClasificacion() {
        // Ordenar los coches por tiempo total de carrera
        Arrays.sort(coches, (c1, c2) -> c1.getTiempoTotal().compareTo(c2.getTiempoTotal()));

        // Imprimir clasificación
        System.out.println("Clasificación final:");
        for (int i = 0; i < coches.length; i++) {
            System.out.println((i + 1) + ". " + coches[i]);
        }
    }
}

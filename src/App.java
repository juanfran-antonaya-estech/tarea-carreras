import juegos.Carrera;
import juegos.Coche;
import juegos.Reloj;

import java.util.*;

public class App {
    private static Carrera carrera;
    private static ArrayList<Coche> coches = new ArrayList<Coche>();

    private static Scanner t = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        carrera = new Carrera(new Reloj(), 0);
        while (true) {
            mostrarMenu(carrera);
        }
    }

    private static void mostrarMenu(Carrera carrera) {
        limpial();
        if (!carrera.isEnCurso()) {
            System.out.println("Bienvenido");
            System.out.println("1. Crear coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Iniciar carrera");
            System.out.println("4. Salir de la aplicación");
            int opcion = pedirInt("opción");

            switch (opcion){
                case 1:
                    coches.add(crearCoche());
                    break;
                case 2:
                    listarCoches();
                    break;
                case 3:
                    iniciarCarrera();
                    break;
                case 4:
                    System.exit(0);
            }
        } else {
            System.out.println("Carrera en curso");
            System.out.println("1. Registrar vuelta");
            System.out.println("2. Finalizar carrera");
            int opcion = pedirInt("opción");

            switch (opcion){
                case 1:
                    registrarVuelta();
                    break;
                case 2:
                    finalizarCarrera();
                    break;
                default:
                    carrera.cambiarEstadoCarrera();
                    break;
            }
        }
    }

    private static void registrarVuelta() {
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
            carrera.registrarTiempoDeVuelta(new Reloj(pedirInt("Horas"), pedirInt("Minutos"), pedirInt("segundos")), coches.get(i));
        }
    }

    private static void finalizarCarrera(){
        carrera.cambiarEstadoCarrera();
        imprimirPodio(carrera.getCoches());
    }

    private static void imprimirPodio(ArrayList<Coche> coches) {

        boolean sorted = false;
        Coche[] cochaux = coches.toArray(new Coche[0]);
        while(!sorted){
            sorted = true;
            for (int i = 0; i < cochaux.length; i++) {
                if (i != cochaux.length - 1) {
                    if (cochaux[i].getSegundos() > cochaux[i + 1].getSegundos()){
                        Coche aux = cochaux[i];
                        cochaux[i] = cochaux[i + 1];
                        cochaux[i + 1] = aux;
                        sorted = false;
                    }

                }
            }
        }

        for (int i = 0; i < cochaux.length; i++) {
            System.out.println("Coche " + (i + 1) + ": "+cochaux[i]);
        }
    }

    private static void iniciarCarrera() {
        for (int i = 0; i < coches.size(); i++) {
        carrera.agregarCoche(coches.get(i));
        }
        carrera.cambiarEstadoCarrera();
    }

    private static void listarCoches() {
        for (int i = 0; i < coches.size(); i++) {
            System.out.println("Coche " + (i + 1) + ": "+coches.get(i));
        }
    }

    private static Coche crearCoche() {
        limpial();
        System.out.println("Crear coche:");
        Coche coche = new Coche(pedirString("nombre"), pedirInt("numero de coche"), pedirInt("Horas"), pedirInt("Minutos"), pedirInt("Segundos"));
        return coche;
    }

    private static void limpial() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int pedirInt(String s) {
        System.out.println("Introduce " + s + ": ");
        int namber = t.nextInt();
        return namber;
    }

    private static String pedirString(String s) {
        System.out.println("Introduce " + s + ": ");
        String texto = t.next();
        return texto;
    }
}

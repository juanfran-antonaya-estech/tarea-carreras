import juegos.Carrera;
import juegos.Coche;
import juegos.Reloj;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

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

        }
    }

    private static void iniciarCarrera() {
        for (int i = 0; i < coches.size(); i++) {
        carrera.agregarCoche(coches.get(i));
        }
        carrera.comenzarCarrera();
    }

    private static void listarCoches() {
        for (int i = 0; i < coches.size(); i++) {
            System.out.println("Coche " + i + ": "+coches.get(i));
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

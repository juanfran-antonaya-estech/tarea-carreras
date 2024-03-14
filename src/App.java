import juegos.Carrera;
import juegos.Coche;
import juegos.Reloj;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class App {
    private static Carrera carrera = new Carrera(new Reloj(), 0);
    private static ArrayList<Coche> coches = new ArrayList<Coche>();
    public static void main(String[] args) throws Exception {
        while (true) {
            mostrarMenu();
        }
    }

    private static void mostrarMenu() {
        limpial();
        if (!carrera.getEstado().equals("En curso")) {
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
        }
    }

    private static void iniciarCarrera() {
        for (int i = 0; i < coches.size(); i++) {
            carrera.agregarCoche(coches.get(i));
        }
    }

    private static void listarCoches() {
        for (int i = 0; i < coches.size(); i++) {
            System.out.println("Coche " + i + ": "+coches.get(i));
        }
    }

    private static Coche crearCoche() {
        limpial();
        System.out.println("Crear coche:");
        Coche coche = new Coche(null, 0, 0, 0, 0);
        return coche;
    }

    private static void limpial() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int pedirInt(String s) {
        System.out.println("Introduce " + s + ": ");
        Scanner t = new Scanner(System.in);
        int namber = t.nextInt();
        t.close();
        return namber;
    }

    private static String pedirString(String s) {
        System.out.println("Introduce " + s + ": ");
        Scanner t = new Scanner(System.in);
        String texto = t.nextLine();
        t.close();
        return texto;
    }
}

import juegos.Coche;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean enCarrera = false;
        while (true) {
            mostrarMenu();
        }
    }

    private static void mostrarMenu() {

    }

    private static Coche crearCoche() {
        limpial();
        System.out.println("Crear coche:");
        Coche coche = new Coche(pedirString("nombre"),pedirInt("horas"), pedirInt("minutos"), pedirInt("segundos"));
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

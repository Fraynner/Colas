package Colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Queue cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        boolean bandera = true;
        String mensaje = " Bienvenido a FastFood \n" + "Por favor seleccione nuestro menu \n" + "1 : Perro Caliente \n"
                + "2 : Hamburguesa \n" +
                "3 : Perra caliente \n" + "4 : Salchipapas \n" + "5 : No quiero nada";
        while (bandera) {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida por favor intente de nuevo");
                sc.next();
            }
            while (sc.nextInt() > 5 || sc.nextInt() < 1) {
                System.out.println("Pagina en mantenimiento por favor escoja una opcion valida: ");
                System.out.println(mensaje);
                opt = sc.nextInt();
                while (!sc.hasNextInt()) {
                    System.out.println("Opcion no valida por favor intente de nuevo");
                    sc.next();
                }
                opt = sc.nextInt();
            }
            switch (opt) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                System.out.println("No compraste nada:( ");
                bandera = false;

                    break;

                default:
                    break;
            }
        }
    }
}

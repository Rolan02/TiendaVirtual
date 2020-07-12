/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import tiendavirtual.modelos.Pelicula;

/**
 *
 * @author roland
 */
public class Main {

    public static void main(String[] args) {

        mostrarMenu();

    }

    public static void mostrarMenu() {

        int salir = 0;
        do {
            System.out.println(":::::::BIENVENIDO A LA TIENDA:::::");
            System.out.println("Seleccione la opcion deceada");
            System.out.println("1.PELICULAS");
            System.out.println("2.SERIES");
            System.out.println("3.LIBROS");
            System.out.println("4.REVISTAS");
            System.out.println("0.SALIR");
        
            Scanner res = new Scanner(System.in);
            int respuesta = Integer.valueOf(res.nextLine());
        
            switch (respuesta) {
                case 0:
                    salir = 0;
                    break;
                case 1:
                    mostrarPeliculas();
                    break;
                case 2:
                    mostrarSeries();
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    mostrarRevistas();
                    break;

                default:
                    System.out.println("");
                    System.out.println("WAAAA QUE TE PASA OPCION INVALIDA");
                    System.out.println("");
            }
        } while (salir != 0);
    }

    public static void mostrarPeliculas() {
        int salida = 1;

        ArrayList<Pelicula> peliculax = Pelicula.generarListaPeliculas();

        do {
            System.out.println();
            System.out.println(":::::BIENVENIDOS A PELICULAS::::::");
            System.out.println();

            for (int i = 0; i < peliculax.size(); i++) {
                System.out.println(i + 1 + "." + peliculax.get(i).getTitulo() + " Visto : " + peliculax.get(i).isEstado());
            }
            System.out.println("0. REGRESAR AL MENU");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());
            if (response == 0) {
                System.out.println(response);
                mostrarMenu();
            }

            Pelicula peliculaSeleccionada = peliculax.get(response - 1);

            peliculaSeleccionada.setEstado(true);

            Date datoInicio = peliculaSeleccionada.tiempoInicio(new Date());
            for (int i = 0; i < 100000; i++) {
                System.out.println("..........");
            }
            peliculaSeleccionada.tiempoDetenido(datoInicio, new Date());
            System.out.println();
            System.out.println("Viste: " + peliculaSeleccionada);
            System.out.println("Por: " + peliculaSeleccionada.getTiempoVisto() + " milisegundos");

        } while (salida != 0);

    }

    public static void mostrarSeries() {
        int salida = 1;
        do {
            System.out.println(":::::::::BIENVENIDOS A SERIES:::::");

        } while (salida != 1);
    }

    public static void mostrarLibros() {
        int salida = 1;
        do {
            System.out.println(":::::BIENVENIDOS A LIBROS::::::");

        } while (salida != 1);

    }

    public static void mostrarRevistas() {
        int salida = 1;
        do {
            System.out.println(":::::BIENVENIDOS A REVISTAS::::::");

        } while (salida != 1);

    }

}

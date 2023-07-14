package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //declarando los datos de entrada del problema
        String ubicacionUsuario;
        String destinoUsuario;
        String nombreUsuario;
        String telefonoUsuario;

        //Declarar un DATO ESPECIAL para capturar informacion
        Scanner teclado = new Scanner(System.in);

    //Para inicializar las VARIABLES
        System.out.println("\u001B[36m VasApp  \u001B[0m");

        System.out.println("Digite su ubicación: ");
        ubicacionUsuario=teclado.nextLine();

        System.out.println("Digite su destino: ");
        destinoUsuario=teclado.nextLine();

        System.out.println("Digite su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.println("Digite su telefono: ");
        telefonoUsuario=teclado.nextLine();

        //PROCESO DEL PROBLEMA
        String distancia="20";//Esto es un texto
        //DEBO HACER UN PARSEO DE LA VARIABLE DISTANCIA
        //PARSEO=CAMBIAR O MODIFICAR EL TIPO DE DATO DE UNA VARIABLE
        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoPorKilometro=6800;
        Integer cobroTotal=distanciaEnEntero*costoPorKilometro;

        //Salidas del problema
        System.out.println("\u001B[36m Señor usuario: "+nombreUsuario+"\u001B[0m");
        System.out.println("\u001B[36m El costo de su viaje es: $"+cobroTotal+" Pesos\u001B[0m");
    }
}
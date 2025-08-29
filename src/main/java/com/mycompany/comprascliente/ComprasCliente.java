package com.mycompany.comprascliente;
import java.util.Scanner;

public class ComprasCliente {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos
        Scanner entrada = new Scanner(System.in);

        // Variables
        String nombre;
        double compra1, compra2, compra3, totalCompras, promedioCompras;

        // Entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese la primera compra: ");
        compra1 = entrada.nextDouble();

        System.out.print("Ingrese la segunda compra: ");
        compra2 = entrada.nextDouble();

        System.out.print("Ingrese la tercera compra: ");
        compra3 = entrada.nextDouble();

        // Cálculos
        totalCompras = compra1 + compra2 + compra3;
        promedioCompras = totalCompras / 3;

        // Salida de datos
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Total compras         : " + totalCompras);
        System.out.println("Promedio de compras   : " + promedioCompras);
    }
}
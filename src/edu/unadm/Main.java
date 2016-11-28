package edu.unadm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Micro POS =====");
        System.out.println("ES1421004131 Diego Plascencia \n\n");
        System.out.println("Introduzca la cantida y precio de sus articulos");
        System.out.println("presione t y enter para terminar");
        double total = readAndGetOrderTotal();
        if (total > 1000) {
            double promo = total * 0.03;
            total -= promo;
        }

        System.out.format("%n%n Total a pagar: %.2f%n", total);
    }

    public static double readAndGetOrderTotal() {
        Scanner scanner = new Scanner(System.in);
        int article = 1;
        double total = 0;
        boolean continueLoop = true;
        do {
            int quantity = 0;
            double price = 0;
            try {
                System.out.format("%nCantidad del articulo %d: ", article);
                quantity = scanner.nextInt();
                System.out.format("Precio del articulo %d: ", article);
                price = scanner.nextDouble();
            } catch (Exception e){
                continueLoop = false;
            }
            article++;
            total += price * quantity;
        } while (continueLoop || scanner.nextLine().isEmpty());

        scanner.close();
        return total;
    }

}

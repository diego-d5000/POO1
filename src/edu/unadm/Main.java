package edu.unadm;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Poliformismo en la implementacion de lsitas y estructuras de datos
        List<Shape> shapes = new ArrayList<Shape>();
        Scanner scanner = new Scanner(System.in);

        shapes.add(new Square("Rojo", 0, 0));
        shapes.add(new Circle("Verde", 0, 0));
        shapes.add(new Shape("Morado", 0, 0));
        shapes.add(new Triangle("Azul", 0, 0));

        // Se recorre la lista de figuras
        for (Shape shape : shapes) {
            // Es una de las ventajas del poliformismo, puedo ejecutar metodos de Shape
            // pero enrealidad se ejecutan los metodos de la figura en turno
            // esto es por que las figuras heredan de Shape y pueden ser tratadas como su clase padre
            try {
                shape.draw();
            } catch (Shape.NoShapeException e) {
                System.out.println("Sin figura");
            }

            // Con la sentencia try intentamos obtener una entrada de texto
            // pero se atrapan 2 excepciones que puede haber al usar Scanner
            try {
                scanner.nextLine();
            } catch (NoSuchElementException e) { // Ocurre cuando no hay nada capturado por el usuario
                System.out.println("\n La figura se borrara en 5 segundos... \n");
                try { // Al no haber entrada del usuario deja la figura mostrarse por 5 seg.
                    Thread.sleep(5000);
                } catch (InterruptedException e1) { // Al poner en pausa el hilo tambien puede haber una excepción
                    e1.printStackTrace();
                }
            } catch (IllegalStateException e) { // Cuando el Scanner no esta abierto o ah sido cerrado anteriormente
                e.printStackTrace();
            }
            shape.erase();
        }

        scanner.close();

    }

}

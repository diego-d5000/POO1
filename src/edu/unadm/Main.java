package edu.unadm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Poliformismo en la implementacion de lsitas y estructuras de datos
        List<Shape> shapes = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        shapes.add(new Square("Rojo", 0, 0));
        shapes.add(new Circle("Verde", 0, 0));
        shapes.add(new Triangle("Azul", 0, 0));

        // Se recorre la lista de figuras
        for (Shape shape : shapes) {
            // Es una de las ventajas del poliformismo, puedo ejecutar metodos de Shape
            // pero enrealidad se ejecutan los metodos de la figura en turno
            // esto es por que las figuras heredan de Shape y pueden ser tratadas como su clase padre
            shape.draw();
            scanner.nextLine();
            shape.erase();
        }

        scanner.close();

    }

}

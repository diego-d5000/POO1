package edu.unadm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("======= EJERCICIO TRIANGULO ======");
        System.out.println("======= ES1421004131 Diego Plascencia ====== \n\n");

        // Intancia de Shape, donde se encuentran los metodos
        Shape shape = new Shape();

        // Llamada a los metodos indicados en la actividad sin paso de parametros
        shape.showInstructions();
        shape.readAndSetValues();
        shape.getArea();
    }

    public static class Shape {
        private double base;
        private double height;
        private double area;

        // metodo que no tetorna ningun valor y no recibe parametros y solo imprime las instrucciones
        public void showInstructions() {
            System.out.println("Introducir la base y la altura del triángulo");
        }

        // metodo que retorna un valor de tipo double (numero leido del usuario) y no recive parametros
        public double readValueFromUser() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        }

        // metodo que no retorna ningun valor y no recibe parametros
        // solo imprime los nombres, lee y asigna los valores de la instancia
        public void readAndSetValues() {
            System.out.println("Base: ");
            double base = readValueFromUser();
            System.out.println("Altura: ");
            double height = readValueFromUser();

            setBaseAndHeight(base, height);
        }

        // metodo que no retorna ningun valor y recibe 2 parametros de tipo double (la base y la altura del triangulo)
        public void setBaseAndHeight(double base, double height) {
            this.base = base;
            this.height = height;
        }

        // metodo que no tetorna ningun valor y no recibe parametros y solo calcula e imprime el area del triangulo
        public void getArea () {
            area = (base * height) / 2;
            System.out.println("Area: " + String.valueOf(area));
        }
    }

}

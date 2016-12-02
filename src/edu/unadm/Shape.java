package edu.unadm;

/**
 * Created by diego-d on 1/12/16.
 */

// Esta es la superclase de la que heredan las demas calses de figuras
// La clase debio haber sido abstracta pero es tema para la Evidencia de aprendizaje
public class Shape {
    String color;
    double positionX;
    double positionY;

    public Shape(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Sobrecarga de constructores
    public Shape(String color, double positionX, double positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Si Shape fuese una clase abstracta ese seria su metodo abstracto
    // ya que no se puede dibujar una figura (sin especificar que tipo es)
    public void draw() {
        System.out.println("Sin figura");

    }

    public void erase() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public void move(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

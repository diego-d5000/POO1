package edu.unadm;

/**
 * Created by diego-d on 1/12/16.
 */

// Esta es la superclase de la que heredan las demas calses de figuras
// La clase ahora es abstracta ya que draw y erase son metodos abstractos
// que debe forzosamente ser implementado por cada figura
// Shape no puede ser instanciado por tal razon
public abstract class Shape implements Drawable {
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
    public abstract void draw();

    public abstract void erase();

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

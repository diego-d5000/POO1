package edu.unadm;

/**
 * Created by diego-d on 1/12/16.
 */
public class Square extends Shape{
    public Square(String color, double positionX, double positionY) {
        super(color, positionX, positionY);
    }

    public void draw() {
        System.out.println("" +
                " * * * * * * * * * * * * *\n" +
                " *                       *\n" +
                " *                       *\n" +
                " *                       *\n" +
                " *                       *\n" +
                " *                       *\n" +
                " *                       *\n" +
                " *                       *\n" +
                " *                       *\n" +
                " * * * * * * * * * * * * *");
        System.out.println("Color: " + this.color);
        System.out.println("Posición: " + String.valueOf(this.positionX) + "," + String.valueOf(this.positionY));

    }

    public void erase() {
        for (int i = 0; i < 66; ++i) System.out.println();
    }
}


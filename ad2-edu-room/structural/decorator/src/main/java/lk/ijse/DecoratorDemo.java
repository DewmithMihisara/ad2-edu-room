package lk.ijse;

import lk.ijse.geo.Circle;
import lk.ijse.geo.RedShapeDecorator;
import lk.ijse.geo.Shape;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        System.out.println("-------------------");

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
package lk.ijse.geo;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

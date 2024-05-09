package lk.ijse.geo;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()  "+this.hashCode());
    }
}

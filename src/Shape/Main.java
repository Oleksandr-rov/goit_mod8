package Shape;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape rhombus = new Rhombus();
        Shape parallelogram = new Parallelogram();
        Shape star = new Star();

        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rhombus);
        shapes.add(parallelogram);
        shapes.add(star);

        drawAllShape(shapes);

    }
    public static void drawAllShape(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
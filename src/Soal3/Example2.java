package Soal3;

/**
 *
 * @author aizarrahima
 */
public class Example2 {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Shape();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

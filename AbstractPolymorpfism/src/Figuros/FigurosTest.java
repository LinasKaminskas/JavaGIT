package Figuros;

        import Figuros.Data.Circle;

public class FigurosTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf("Apskritimo plotas %.2f", circle.circleArea());
        System.out.println(" ");
        System.out.printf("Apskritimo perimetras  %.2f", circle.circlePerimeter());

    }
}

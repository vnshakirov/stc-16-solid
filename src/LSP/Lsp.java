package LSP;

public class Lsp {

    public static void main(String[] args) {
        Rectangle rectangle = FigureFactory.newRectangle(2, 4);
        Square square = FigureFactory.newSquare(4);

        showArea(rectangle);
        showArea(square);
    }

    private static void showArea(Square figure) {
        System.out.println("Expected area is " + figure.getArea() + " for " + figure.toString());
    }

    private static void showArea(Rectangle figure) {
        System.out.println("Expected area is " + figure.getArea() + " for " + figure.toString());
    }
}
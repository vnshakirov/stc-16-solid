package LSP;

public class FigureFactory {
    public static Square newSquare(int side) {
        return new Square(side);
    }

    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }
}
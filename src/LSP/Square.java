package LSP;

public class Square extends Rectangle {

    public Square(int width) {
        super(width, width);
    }

    @Override
    public String toString() {
        return "Square(" +
                "width=" + width +
                ", height=" + height +
                ')';
    }
}

package LSP;

public class Rectangle {
    protected int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle(" +
                "width=" + width +
                ", height=" + height +
                ')';
    }
}

package OCP;

class Product {
    private String name;
    private Color color;
    private Size size;
    private double square;

    Product(String name, Color color, Size size, double square) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.square = square;
    }

    public String toString() {
        return name + " " + color.toString() + " " + size.toString();
    }
}

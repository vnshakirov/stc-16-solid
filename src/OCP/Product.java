package OCP;

class Product {
    private String name;
    private Color color;
    private Size size;

    Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return name + " " + color.toString() + " " + size.toString();
    }
}

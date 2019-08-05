package ISP;

public class Document {

    private String text;

    public Document(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

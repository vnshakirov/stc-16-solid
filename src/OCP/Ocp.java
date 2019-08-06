package OCP;

import java.util.Arrays;
import java.util.List;

public class Ocp {
    public static void main(String[] args) {
        Product apple = new Product("Bicycle", Color.RED, Size.SMALL, 0);
        Product house = new Product("House", Color.BLUE, Size.LARGE, 100.0);
        //TODO Добавить площадь дома
        List<Product> productList = Arrays.asList(apple, house);
        productList.forEach(System.out::println);
    }
}

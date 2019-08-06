package DIP;

public class Tester implements Worker {

    public void test() {
        System.out.println("I'm testing");
    }

    @Override
    public void work() {
        test();
    }
}

package DIP;

public class Programmer implements Worker {

    public void code() {
        System.out.println("I'm coding");
    }

    @Override
    public void work() {
        code();
    }
}

package DIP;

public class Manager {

    public void manage(Programmer programmer) {
        programmer.code();
    }

    public void manage(Tester tester) {
        tester.test();
    }
}

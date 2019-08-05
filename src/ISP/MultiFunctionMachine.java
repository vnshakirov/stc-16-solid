package ISP;

public class MultiFunctionMachine implements MultiFunctionDevice {

    MultiFunctionMachine() {
    }

    public void print(Document d) throws Exception {
        System.out.println(d.toString() + " printed");
    }

    public void scan(Document d) throws Exception {
        System.out.println(d.toString() + " scanned");
    }

    public void copy(Document d) throws Exception {
        System.out.println(d.toString() + " copied");
    }
}
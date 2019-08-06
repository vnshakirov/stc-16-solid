package ISP;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Printer implements MultiFunctionDevice {
    @Override
    public void scan(Document d) throws Exception {
        throw new NotImplementedException();
    }

    @Override
    public void copy(Document d) throws Exception {
        throw new NotImplementedException();
    }

    @Override
    public void print(Document d) throws Exception {
        System.out.println("Printer printing " + d.toString());
    }
}

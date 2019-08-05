package ISP;

public interface MultiFunctionDevice {
    void scan(Document d) throws Exception;
    void copy(Document d) throws Exception;
    void print(Document d) throws Exception;
}

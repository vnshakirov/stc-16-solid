package ISP;

public class Isp {
    public static void main(String[] args) throws Exception {

        Document document = new Document("Document");

        MultiFunctionMachine multiFunctionMachine = new MultiFunctionMachine();
        multiFunctionMachine.copy(document);
        multiFunctionMachine.scan(document);
        multiFunctionMachine.print(document);
        //TODO и тут к нам поступил новый девайс, который умеет только печатать
    }
}





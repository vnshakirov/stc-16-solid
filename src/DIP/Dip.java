package DIP;

class Dip {
    public static void main(String[] args) {
        Programmer vasya = new Programmer();
        Tester petya = new Tester();
        Manager manager = new Manager();
        manager.manage(vasya);
        manager.manage(petya);
        //TODO Я менеджер, я хочу написать в чатик "Всем работать"
    }
}

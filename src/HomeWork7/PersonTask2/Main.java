package HomeWork7.PersonTask2;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Рабочий");
        worker.print();
        Accountant accountant = new Accountant("Бухгалтер");
        accountant.print();
        Director director = new Director("Директор");
        director.print();
    }
}

package HomeWork7.PersonTask2;

public class Worker implements NamePositions{
    String nameWorker;

    Worker(String nameWorker){
        this.nameWorker = nameWorker;
    }

    @Override
    public void print() {
        System.out.println(nameWorker);
    }
}

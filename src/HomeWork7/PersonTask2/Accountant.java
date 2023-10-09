package HomeWork7.PersonTask2;

public class Accountant implements NamePositions{
    String nameAccountant;

    Accountant(String nameAccountant){
        this.nameAccountant = nameAccountant;
    }

    @Override
    public void print() {
        System.out.println(nameAccountant);
    }
}

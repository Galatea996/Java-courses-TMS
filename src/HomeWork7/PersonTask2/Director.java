package HomeWork7.PersonTask2;

public class Director implements NamePositions{
    String nameDirector;

    Director(String nameDirector){
        this.nameDirector = nameDirector;
    }

    @Override
    public void print() {
        System.out.println(nameDirector);
    }
}

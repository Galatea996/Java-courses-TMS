package HomeWork6.Task2;

public class HDD {
    String name ;
    int size;
    String type;

    public HDD(){
        name = "Fer";
        size = 250;
        type = "X9";
    }
    public HDD(String name, int size, String type){
        this.name = name;
        this.size = size;
        this.type = type;
    }
    public void showInformation(){
        System.out.println(name);
        System.out.println(size);
        System.out.println(type);
    }
}

package HomeWork6.Task2;

public class RAM {
    String name;
    int size;
    public RAM(){
        name = "Wer";
        size = 8;
    }
    public RAM(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void showInformation(){
        System.out.println(name);
        System.out.println(size);
    }
}

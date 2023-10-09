package HomeWork6.Task2;

public class ComputerDescriptions {
    double price;
    String model;
    RAM ram;
    HDD hdd;

    public ComputerDescriptions(double price, String model){
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }
    public ComputerDescriptions(double price, String model, String ramName, int ramSize, String hddName, int hddSize, String hddType){
        this.price = price;
        this.model = model;
        this.ram = new RAM(ramName, ramSize);
        this.hdd = new HDD(hddName, hddSize, hddType);

    }
    public void showInformation(){
        System.out.println(price);
        System.out.println(model);
        ram.showInformation();
        hdd.showInformation();
    }

}
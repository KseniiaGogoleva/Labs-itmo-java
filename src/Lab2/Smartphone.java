package Lab2;

public class Smartphone {
    private String brand;
    private String model;
    private int storage;
    private double price;


    public Smartphone(String brand, String model, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
    }
    public void PhoneDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Apple", "iPhone 16", 512, 1799.99);
        phone.PhoneDetails();
    }
}

package Lab2;
public class Phone {
    private String brand;
    private String model;
    private int storage;
    private double price;

    public Phone() {
        brand = "Unknown";
        model = "Unknown";
        storage = 0;
        price = 0.0;
    }
    public void PhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: RUB" + price);
    }
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.PhoneDetails();
    }
}
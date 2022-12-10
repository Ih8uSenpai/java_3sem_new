package task3;

public class Bed extends Furniture implements purchasable{
    String type = "Bed";
    public Bed() {
        super("Bed1", "Oak", 31000, 5, 654321);
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public Bed(String name, String material, int price, int amount, int ID) {
        super(name, material, price, amount, ID);
    }

    @Override
    public boolean is_available(int amount) {
        if(this.amount < amount) {
            System.out.println("Error: Amount of available product: " + this.amount);
            return false;
        }
        return true;
    }

    @Override
    public int getID() {
        return ID;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    @Override
    public String getType() {
        return type;
    }
}

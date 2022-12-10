package task3;

public class Chair extends Furniture implements purchasable{
    String type = "Chair";
    public Chair() {
        super("Chair1", "Pine", 1000, 10, 123456);
    }

    public Chair(String name, String material, int price, int amount, int ID) {
        super(name, material, price, amount, ID);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
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

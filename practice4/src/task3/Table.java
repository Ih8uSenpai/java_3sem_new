package task3;

public class Table extends Furniture implements purchasable{
    String type = "Table";
    public Table() {
        super("Table1", "Oak", 3000, 5, 654321);
    }
    @Override
    public int getPrice() {
        return price;
    }

    public Table(String name, String material, int price, int amount, int ID) {
        super(name, material, price, amount, ID);
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

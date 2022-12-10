package task3;

public abstract class Furniture implements purchasable{
    protected String type, name, material;
    protected int price, amount, ID;


    public Furniture(String name, String material, int price, int amount, int ID) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.amount = amount;
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", ID=" + ID +
                '}';
    }

}

package task3;

public interface purchasable {
    int getPrice();
    void setPrice(int price);
    boolean is_available(int amount);
    int getID();
    String getType();
    public void setAmount(int amount);
    public int getAmount();
}

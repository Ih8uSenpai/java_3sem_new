package task3;
import java.util.*;
public class Test {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        /*пополним магазин*/
        FurnitureShop shop = new FurnitureShop("God Furniture");
        Chair chair1 = new Chair("Chair1", "leather", 15000, 5, 932953);
        Chair chair2 = new Chair("Chair2", "MaterialX", 55000, 2, 228953);
        Chair chair3 = new Chair("Chair3", "MaterialA", 5000, 25, 785313);
        Table table1 = new Table("Table1", "MaterialA", 1242, 21, 746341);
        Table table2 = new Table("Table2", "MaterialB", 6412, 12, 121241);
        Table table3 = new Table("Table3", "MaterialC", 23172, 3, 111541);
        Bed bed1 = new Bed("Bed1", "MaterialA", 12341, 25, 124351);
        Bed bed2 = new Bed("Bed2", "MaterialB", 31541, 11, 942012);
        Bed bed3 = new Bed("Bed3", "MaterialC", 423412, 1, 102211);
        shop.add_product(chair1);
        shop.add_product(table1);
        shop.add_product(bed1);
        shop.add_product(chair2);
        shop.add_product(table2);
        shop.add_product(bed2);
        shop.add_product(chair3);
        shop.add_product(table3);
        shop.add_product(bed3);
        System.out.println("login: ");
        String login = in.nextLine();
        System.out.println("password: ");
        String password = in.nextLine();
        Account acc = new Account(login, password);
        System.out.printf("Successful authorization!\n\nHello! %s! Please feel free to buy some furniture <3\n", acc.login);
        Catalog.show_list();
        while (true) {
            System.out.println("\nChoose furniture type:");
            in = new Scanner(System.in);
            String s = in.nextLine();
            Catalog catalog;
            switch (s) {
                case "Chair":
                    catalog = Catalog.Chair;
                    Catalog.Show_list(catalog, shop);
                    break;
                case "Table":
                    catalog = Catalog.Table;
                    Catalog.Show_list(catalog, shop);
                    break;
                case "Bed":
                    catalog = Catalog.Bed;
                    Catalog.Show_list(catalog, shop);
                    break;
            }
            System.out.println("Enter item ID:");
            int id = in.nextInt();
            System.out.println("Enter amount of items that u want to buy:");
            int num = in.nextInt();
            shop.buy(num, id);
        }
    }
}

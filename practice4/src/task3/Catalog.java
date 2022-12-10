package task3;

import task1.task;

public enum Catalog{
    Chair, Table, Bed;
    static void show_list(){
        for (Catalog catalog : Catalog.values())
            System.out.println(catalog);
    }
    public static void Show_list(Catalog catalog, FurnitureShop shop) {
        switch (catalog){
            case Chair:
                System.out.println("Catalog - Chair:");
                shop.show_price_list("Chair");
                break;
            case Table:
                System.out.println("Catalog - Table:");
                shop.show_price_list("Table");
                break;
            case Bed:
                System.out.println("Catalog - Bed:");
                shop.show_price_list("Bed");
                break;
        }
    }
}

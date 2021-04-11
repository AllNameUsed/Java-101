import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Item> listOfItems;

    //
    private static class Item{
        int SKU;
        int price;
        String name;
        public Item(int sku, int price, String name){
            this.SKU = sku;
            this.price = price;
            this.name = name;
        }
        public boolean equal(Item x) {
            return x.SKU == this.SKU;
        }
    }


    public Shop(){
        this.listOfItems = new ArrayList<Item>();
    }
    public Shop(List<Item> list){
        this.listOfItems = list;
    }
    public boolean addItem(Item i) {
        for (Item x : this.listOfItems) {
            if (x.equal(i)) {
                return false;
            }
        }
        this.listOfItems.add(i);
        return true;
    }

    public static void main(String[] args) {
        Item rice = new Item(1,2,"Rice");
        Item potatoe = new Item(2,5,"Potato");

        Shop ourNewShop = new Shop();
        ourNewShop.addItem(rice);
        ourNewShop.addItem(potatoe);

        if (ourNewShop.addItem(rice)) {
            System.out.println("We've added rice again!! This shouldn't have happened!!");
        } else {
            System.out.println("Error!! We already have this item for sale!!");
        }
    }
}

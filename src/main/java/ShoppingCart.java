import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static ArrayList<Item> items = new ArrayList<Item>();
    protected double total;
    private double price;
    private int quantity;
    private double shipping;
    private Invoice invoice;

    public ShoppingCart(){

    }
    public ShoppingCart(double shipping){
        this.shipping = shipping;
    }

    public ArrayList<Item> addItem(Item item){
        items.add(item);
        // items.add(String.valueOf(item.getQuantity()));
        // items.add(item.getItem());

        return items;
    }
    public static ArrayList<Item> getItems(){
        return items;
    }
    public double calculateTotal(){
        for(int i = 0 ; i < items.size(); i++){
            this.price = items.get(i).getPrice();
            this.quantity = items.get(i).getQuantity();
            total += (this.price * this.quantity);
        }
        this.total *= 1.1;
        if(this.total < 10.00){
            this.total += this.shipping;
        }
        return this.total;
    }
    public double getShipping(){
        return this.shipping;
    }

    public Invoice shipOrder(String name, String address, String city, String state, int zipcode){
        Invoice invoice = new Invoice(name,address,city,state,zipcode);
        return invoice;
    }
    public String getTotal(){
        return "$"+ String.format("%.2f",total);

    }
    // public String toString(){
    //     String output = "";
    //     // output += "Ship to: \n";
    //     // output += " " + invoice.getName() + "\n";
    //     // output += " " + invoice.getAddress() + "\n";
    //     // output += " " + invoice.getCity() + ", " + invoice.getState() + " " + invoice.getZipcode() + "\n";
    //     // output += "Items \n";
    //     // output += "----- \n";
    //     for(int i = 0; i < this.items.size(); i++){
    //         output += this.items.get(i).getItem() + " $" + String.format("%.2f",this.items.get(i).getPrice()) 
    //     + " (" + this.items.get(i).getQuantity() + ")" + " $" 
    //     + String.format("%.2f",(this.items.get(i).getPrice() * this.items.get(i).getQuantity() )) + "\n" ;
    //         total += (this.items.get(i).getPrice() * this.items.get(i).getPrice());
    //     }
    //     if(total < 10.00){
    //         output += "Shipping: $" + String.format("%.2f",getShipping()) + "\n";
    //     }
    //     output += "Shipping: Free \n";
    //     output += "Total Cost:\n";
    //     output += "---------\n";
    //     output += getTotal();
    //     return output;
    // }
}

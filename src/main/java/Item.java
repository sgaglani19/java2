public class Item {
    private double price;
    private int quantity;
    private String item;

    public Item(double price, int quantity,String item){
        this.price = price;
        this.quantity = quantity;
        this.item = item;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String getItem(){
        return this.item;
    }
    // public String toString(){
    //     return "" + this.price  + " " + this.quantity + " " + this.item;
    // }
}

import java.util.List;

public class Invoice extends ShoppingCart {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private Item item;
    // private double total;
    private List<Item> inv;

    public Invoice(String name, String address, String city, String state, int zipcode){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
    public int getZipcode(){
        return this.zipcode;
    }
    public String toString(){
        String output = "";
        output += "Ship to: \n";
        output += " " + this.name + "\n";
        output += " " + this.address + "\n";
        output += " " + this.city + ", " + this.state + " " + this.zipcode + "\n";
        output += "\nItems \n";
        output += "----- \n";
        for(int i = 0; i < getItems().size(); i++){
            output += getItems().get(i).getItem() + " $" + String.format("%.2f",getItems().get(i).getPrice()) 
        + " (" + getItems().get(i).getQuantity() + ")" + " $" 
        + String.format("%.2f",(getItems().get(i).getPrice() * getItems().get(i).getQuantity() )) + "\n" ;
            total += (getItems().get(i).getPrice() * getItems().get(i).getQuantity());
        }
        if(total < 10.00){
            output += "Shipping: $" + String.format("%.2f",getShipping()) + "\n";
        }
        output += "\nShipping: Free \n";
        output += "\nTotal Cost:\n";
        output += "---------\n";
        output += getTotal();

        return output;
        // output += item.getItem() + " $" + String.format("%.2f",item.getPrice()) 
        // + " (" + item.getQuantity() + ")" + " $" 
        // + String.format("%.2f",(item.getPrice() * item.getQuantity() )) ;

    }
}

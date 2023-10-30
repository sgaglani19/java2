import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
        ex6();
    }

    private static void ex1() {
        Person p1 = new Person();
        Person p2 = new Person("Jon","Smith");
        Person p3 = new Person("Mary","Jane",123456789);
        p1.speak();
        p2.speak();
        p3.speak();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }

    private static void ex2() {
        
    }

    private static void ex3() {
        var n1 = new AwesomeNumber(4);
        var n2 = new AwesomeNumber(2);
        var result1 = AwesomeNumber.add(n1, n2);
        var result2 = AwesomeNumber.subtract(n1, n2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void ex4() {
        var calculator =  new Calculator();
        var result1 = calculator.add(1, 2);
        var result2 = calculator.subtract(4, 2);
        var result3 = calculator.divide(10, 5);
        var result4 = calculator.multiply(2, 2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(calculator.getHistory());

    }

    private static void ex5() {
        ShoppingCart shoppingCart = new ShoppingCart();
        ShoppingCart ct = new ShoppingCart(5.00);
        shoppingCart.addItem(new Item(2.00, 4, "Socks"));
        shoppingCart.addItem(new Item(10.00, 2, "Shirts"));
        shoppingCart.calculateTotal();
        // System.out.println("This is total" + shoppingCart.getTotal());
        // ct.addItem(new Item(2.00, 3, "Socks"));
        // ct.addItem(new Item(1.00, 2, "Shirts"));
        // ct.calculateTotal();
        // System.out.println(ct.getTotal());
        var invoice = shoppingCart.shipOrder("Jon Smith", "123 Green Street", "Austin", "TX", 78737);
        System.out.println(invoice.toString());
    }

    public static void ex6(){
        var shapes = new ArrayList<Shape>();
        shapes.add(new Square(3));
        shapes.add(new Rectangle(10,3));
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

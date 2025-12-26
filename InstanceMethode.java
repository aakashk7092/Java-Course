class Mobile {
    static String brand;
    int price;
    String name;

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
    public static void show1(Mobile obj1) {
        System.out.println("Brand: " + obj1.brand);
        System.out.println("Price: " + obj1.price);
        System.out.println("Name: " + obj1.name);
    }
}   
public class InstanceMethode {
    public static void main(String[] args) {
          Mobile obj1 = new Mobile();
            obj1.brand = "Apple";
            obj1.price = 90000;
            obj1.name =  "mac Air 17 Pro";  
            Mobile.brand = "samsung";
            obj1.show();  
            Mobile.show1(obj1);              
    }
}

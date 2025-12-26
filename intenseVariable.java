class Mobile{
    String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }
}

public class intenseVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 90000;
        obj1.name =  "mac Air 17 Pro";

        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.name = "NoteBook Pro";
        obj1.show();
        obj2.show();

    }
}

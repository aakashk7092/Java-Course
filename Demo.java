class Calculator{
    int a ;
    public int add(){
        System.out.println("in add");
        return 0;
    }
}
public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;
        Calculator calc = new Calculator() ;
        calc.add();
    }
}

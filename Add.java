class Calculator{
    public int add(int n1 ,int n2){
        int r  = n1 + n2;
        return r;
    }
}

public class Add{
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
         Calculator calc = new Calculator();
         int additon = calc.add(4,5);
         System.out.println(additon);

    }
}

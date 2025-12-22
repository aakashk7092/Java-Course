class Computer
{
    public void  playMusic()
    {
        System.out.println("Music Playing ......");
    }
    public String getMePen(int cost)
    {
        if(cost >=5){
            return "Pen";
        }else{
            return "Add some more Money 5 or more than 5 rupees";
        }
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.getMePen(1));
    }
}

package Singelton;

/**
 * Exisist only as the one instance
 */
public class SingeltonTutorial {
    public static void main(String[] args) {

    }
}
class SingelTon{
    SingelTon singelTon = new SingelTon();
    private SingelTon(){

    }
    public SingelTon getSingelTon(){
        return singelTon;
    }
}

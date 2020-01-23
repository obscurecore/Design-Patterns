package Strategy;



public class StrategyTutorial {
    public static void main(String[] args) {

    }
}

class Door{
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void move(){
        strategy.openClose();
    }
}
interface Strategy{
    void openClose();
}
class Open implements Strategy {

    @Override
    public void openClose() {
        System.out.println("The door is opened");
    }
}


class Close implements Strategy {

    @Override
    public void openClose() {
        System.out.println("The door is closed");
    }
}
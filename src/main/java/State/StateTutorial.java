package State;

public class StateTutorial {
    public static void main(String[] args) {
        State open =  new Open();
        Door door = new Door();
        door.setState(open);
    }
}

class Door {
    private State state;

    void setState(State state) {
        this.state = state;
    }
    void changeState(){
        if(state instanceof Open){
            setState(new Close());
        }
        if(state instanceof Close){
            setState(new Open());
        }
    }
    void move(){
        state.openClose();
    }
}

interface State {
    void openClose();
}

class Open implements State {

    @Override
    public void openClose() {
        System.out.println("The door is opened");
    }
}


class Close implements State {

    @Override
    public void openClose() {
        System.out.println("The door is closed");
    }
}
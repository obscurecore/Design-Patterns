package FactoryMethod;

public class FactoryTutorialView {
    public static void main(String[] args) {
        Factory factory = new CreatorFactory(0);
        factory.create();
    }
}
interface Chocolate{

}
class WhiteChocolate implements Chocolate{

}

class BlackChocolate implements Chocolate{

}
abstract class Factory{
    int flag;// determine which one objects will been created

    Factory(int flag){
        this.flag = flag;
    }
    abstract Chocolate create();// Main idea is that it will created certain objects in relation to flag
}

class CreatorFactory extends Factory{

    CreatorFactory(int flag) {
        super(flag);
    }

    @Override
    Chocolate create() {
        if (flag==0){
            return new WhiteChocolate();
        }
        if(flag==1){
            return new BlackChocolate();
        }
        else{
            throw  new IllegalArgumentException();
        }
    }
}
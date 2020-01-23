package AbstractFactory;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class AbstractFactroyTutorial {
    public static void main(String[] args) {

    }
}

interface Car {
    void drive();
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("yeap");
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("yeah");
    }
}

class CarFactory implements Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}


interface Tank {
    void drive();
}

class IS_7 implements Tank {

    @Override
    public void drive() {
        System.out.println("KS");
    }
}

class ISU implements Tank {

    @Override
    public void drive() {
        System.out.println(":)))))))))");
    }
}

class TankFactory implements Factory {
    public Tank create(String typeOfCar) {
        switch (typeOfCar) {
            case "IS_7":
                return new IS_7();
            case "ISU":
                return new ISU();
            default:
                return null;
        }
    }
}

interface Factory {
    //createTank();
    //   createCar();
}

class AbstractFactory {
    public Factory createFactory(String tyOfFactory) {
        switch (tyOfFactory) {
            case "Car":
                return new CarFactory();
            case "Tank":
                return new TankFactory();
            default:
                return null;
        }
    }
}

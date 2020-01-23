package CompositeEntity;

public class CompositeEntityTutorial {
    public static void main(String[] args) {
        CompositeEntity compositeEntity = new CompositeEntity();
        for (String s :compositeEntity.getData()){
            System.out.println(s);
        }
    }
}

class DependentObject1 {
    String getData() {
        return "one";
    }
}

class DependentObject2 {
    String getData() {
        return "two";
    }
}

class DependentObject3 {
    String getData() {
        return "three";
    }
}

class CoarseGainedObject {//simplify network traffic by combing services
    DependentObject1 dependentObject1 = new DependentObject1();
    DependentObject2 dependentObject2 = new DependentObject2();
    DependentObject3 dependentObject3 = new DependentObject3();
    public String[] getData(){
        return new String[]{dependentObject1.getData(),dependentObject2.getData()};
    }
}

class CompositeEntity{
    CoarseGainedObject coarseGainedObject = new CoarseGainedObject();
    public String[] getData(){
       return coarseGainedObject.getData();
    }
}
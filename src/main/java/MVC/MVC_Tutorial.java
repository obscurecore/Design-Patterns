package MVC;

public class MVC_Tutorial {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}

interface ModelLayer {
    Student getStudent();
}

class DBlayer implements ModelLayer {

    @Override
    public Student getStudent() {
        return new Student();//TODO statement to BD
    }
}

class Filelayer implements ModelLayer {

    @Override
    public Student getStudent() {
        return new Student();//TODO statement to BD
    }
}

interface View {
    void showStudent(Student student);
}

class ConsoleView implements View {

    @Override
    public void showStudent(Student student) {
        System.out.println(student.name);
    }
}

class Controller {
    ModelLayer modelLayer = new DBlayer();
    View view = new ConsoleView();

    void execute() {
        Student student = modelLayer.getStudent();
        view.showStudent(student);
    }
}


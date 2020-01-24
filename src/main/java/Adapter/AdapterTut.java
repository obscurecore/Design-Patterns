package Adapter;

public class AdapterTut {

}

class Client {
    public static void main(String[] args) {
        PrintInterface printInterface = new PrinterSecond();
        PrinterComp printerComp = new PrinterComp(new Printer());
    }
}

interface PrintInterface {
    void consolePrint();

}


class PrinterComp implements PrintInterface {

    private final Printer printer;

    PrinterComp(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void consolePrint() {
        printer.printf();
    }
}

class PrinterSecond extends Printer implements PrintInterface {

    @Override
    public void consolePrint() {
        this.printf();
    }
}

class Printer {
    void printf() {
        System.out.println("Hello");
    }
}

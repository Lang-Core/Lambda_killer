package demo01;

public class Main {
    public static void main(String[] args) {
        printThing(() -> System.out.println("meaw"));
    }

    // takes any object that implements Printable interface
    static void printThing(Printable thing) {
        thing.print();
    }
}



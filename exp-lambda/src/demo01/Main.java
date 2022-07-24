package demo01;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        // 01. we implement the Printable interface inside the Cat class
        // 02. we define the print() method that we wanted inside that Cat class
        // 03. create an object from that class
        // 04. pass that cat object into PrintThing() method.

        // ** 05. instead doing all that we pass the implementation of that print()
        // method that we wanted to use as our printable parameter.

        // ** Earlier we passed object with action
        // ** Now we pass only the action
        printThing(() -> System.out.println("Meaw..."));
    }

    // takes any object that implements Printable interface
    static void printThing(Printable thing) {
        thing.print();
    }
}



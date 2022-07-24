package demo01;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        //myCat.print();
        //printThing(myCat);
        printThing(
            () -> {
                System.out.println("Meaw...");
            }
        );
    }

    // takes any object that implements Printable interface
    static void printThing(Printable thing) {
        thing.print();
    }
}



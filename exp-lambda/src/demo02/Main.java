package demo02;

public class Main {
    public static void main(String[] args) {
        String lambda = printThing(((prefix, suffix) -> prefix + "Bond" + suffix));

        System.out.println(lambda);
    }

    static String printThing(Printable thing) {
        return thing.print("Mr.", "!");
    }
}

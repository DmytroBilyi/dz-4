

public class Main {
    public static void main(String[] args) {
        Second second = new Second();
        String s = String.format("~~~%s~~~", second.printMethod());
        System.out.println(s);

    }
}
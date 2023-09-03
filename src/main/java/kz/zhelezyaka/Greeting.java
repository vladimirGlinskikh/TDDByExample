package kz.zhelezyaka;

public class Greeting {
    private static final String HELLO = "Hello";
    private static final String TDD = "TDD";

    public String helloTDD() {
        return HELLO + " " + TDD;
    }

    public String helloTDD(String name) {
        return HELLO + " " + name;
    }
}

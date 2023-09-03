package kz.zhelezyaka;

import org.junit.jupiter.api.Test;

class GreetingTest {

    @Test
    void helloTDD() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloTDD());
    }

    @Test
    void testHelloTDD() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloTDD("Vladimir from TDD"));
    }
}
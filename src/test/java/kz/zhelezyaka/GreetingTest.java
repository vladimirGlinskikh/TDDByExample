package kz.zhelezyaka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
   private Greeting greeting;

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each methods...");
        greeting = new Greeting();
    }

    @Test
    void helloTDD() {
        System.out.println(greeting.helloTDD());
    }

    @Test
    void testHelloTDD() {
        System.out.println(greeting.helloTDD("Vladimir from TDD"));
    }
}
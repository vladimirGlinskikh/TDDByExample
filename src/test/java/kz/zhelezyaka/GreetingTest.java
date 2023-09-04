package kz.zhelezyaka;

import org.junit.jupiter.api.*;

class GreetingTest {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once!");
    }

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

    @AfterEach
    void tearDown() {
        System.out.println("In After Each...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called once!");
    }
}
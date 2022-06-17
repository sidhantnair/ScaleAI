import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloTest {

    Hello hello = new Hello();

    @Test
    void test_func_returns_true() {
        assertTrue(hello.returnTrue());
    }

}

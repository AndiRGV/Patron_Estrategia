import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CatTest {

    @Test
    public void testCatDisplay() {
        Cat cat = new Cat();
        cat.display();
        assertEquals("Cat", cat.toString());
    }

    @Test
    public void testCatSound() {
        Cat cat = new Cat();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        cat.makeSound();
        assertEquals("Meow\n", outContent.toString().trim());
        System.setOut(System.out);

        assertEquals("Cat", cat.toString());
    }
}


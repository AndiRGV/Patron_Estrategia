import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DogTest {

    @Test
    public void testDogDisplay() {
        Dog dog = new Dog();
        dog.display();
        assertEquals("Dog", dog.toString());
    }

    @Test
    public void testDogSound() {
        Dog dog = new Dog();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        dog.makeSound();
        assertEquals("Bark\n", outContent.toString().trim());
        System.setOut(System.out);

        assertEquals("Dog", dog.toString());
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        Bark bark = new Bark();
        dog.setSound(bark);
        dog.makeSound();
        assertEquals("Dog", dog.toString());
    }
}

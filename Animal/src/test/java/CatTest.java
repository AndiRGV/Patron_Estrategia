import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        Meow meow = new Meow();
        cat.setSound(meow);
        cat.makeSound();
        assertEquals("Cat", cat.toString());
    }
}

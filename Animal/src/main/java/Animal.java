import java.util.Objects;

public class Animal {
    private ISound soundStrategy;

    public void display() {
        System.out.println("Mostrando información del animal");
    }

    public void makeSound() {
        if (soundStrategy != null) {
            soundStrategy.sound();
        } else {
            System.out.println("No hay sonido disponible.");
        }
    }

    public void setSound(ISound sound) {
        this.soundStrategy = Objects.requireNonNull(sound, "El comportamiento de sonido  es null");
    }

    @Override
    public String toString() {
        return "Animal";
    }
}


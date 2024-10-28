public class Dog extends Animal {
    private final Bark bark = new Bark();

    public Dog() {
        setSound(bark);
    }

    @Override
    public void display() {
        System.out.println("Mostrar Dog");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}

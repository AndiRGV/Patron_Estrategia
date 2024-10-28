public class Cat extends Animal {
    private final Meow meow = new Meow();

    public Cat() {
        setSound(meow);
    }

    @Override
    public void display() {
        System.out.println("Mostrar Cat");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}


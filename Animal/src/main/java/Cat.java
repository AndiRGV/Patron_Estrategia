public class Cat extends Animal {
    public Meow meow = new Meow();
    @Override
    public void display() {
        System.out.println("Mostrar Cat");
    }

    @Override
    public void setSound(ISound sound) {
        super.setSound(meow);
    }

    @Override
    public String toString() {
        return "Cat";
    }
}

public class Dog extends Animal {
    public Bark bark  = new Bark();
    @Override
    public void setSound(ISound sound) {
        super.setSound(bark);
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

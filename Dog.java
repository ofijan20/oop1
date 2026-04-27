public class Dog extends Animal {
    
    public Dog(String name) {
        super(name); // This sends the name to the Animal class
    }

    @Override
    public void sound() {
        System.out.println("Bark bark!");
    }

    public void display() {
        System.out.println("Dog Name: " + name);
    }
}
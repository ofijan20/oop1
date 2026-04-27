public class Main {
    public static void main(String[] args) {

        // Creating object of child class
        Dog d1 = new Dog("Rex");

        // Calling methods
        d1.display();  // from parent class
        d1.sound();    // overridden in child class
    }
}
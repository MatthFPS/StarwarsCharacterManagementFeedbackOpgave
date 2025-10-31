public class Sith extends Character implements ForceUser {

    public Sith(String name, int age) {
        super(name, age); // Henter navn og alder fra Character
    }

    // Overrider action fra Character
    @Override
    public void action() {
        System.out.println(getName() + " is using the Force on his enemy!");
    }

    // Implementerer useForce fra ForceUser
    @Override
    public void useForce() {
        System.out.println(getName() + " is using the Force for the dark side");
    }
}

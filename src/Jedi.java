public class Jedi extends Character implements ForceUser {

    public Jedi(String name, int age) {
        super(name, age); // Henter navn og alder fra Character
    }

    // Overrider action fra Character
    @Override
    public void action() {
        System.out.println(getName() + " is using lightsaber to parry blaster bullets!");
    }

    // Meditate metoden
    public void meditate() {
        System.out.println(getName() + " is connecting with the Force through meditation");
    }

    // Implementerer useForce fra ForceUser
    @Override
    public void useForce() {
        System.out.println(getName() + " is using the Force for the good");
    }
}

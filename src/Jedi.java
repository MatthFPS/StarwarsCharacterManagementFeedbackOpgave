public class Jedi extends Character {

    public Jedi(String name, int age) {
        //Bruger Super til at få navn og alder
        super(name, age); //Character Konstruktøren, name og age.
    }
    //Overrider Action fra Character
    @Override
    public void action() {
        System.out.println(name + "is using lightsaber to parry blaster bullets!");
    }
    //Meditate metoden for sig selv
    public void meditate(){
        System.out.println(getName() + " is connecting with the force through meditation");
    }
}

public class Sith extends Character {

    public Sith(String name, int age) {
        //Bruger Super til at få navn og alder
        super(name, age); //Character Konstruktøren, name og age.
    }
    //Overrider Action fra Character
    @Override
    public void action() {
        System.out.println(name + "is using the Force on his enemy!");
    }
}

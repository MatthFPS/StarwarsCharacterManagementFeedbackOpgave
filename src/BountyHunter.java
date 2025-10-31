public class BountyHunter extends Character {

    public BountyHunter(String name, int age) {
        //Bruger Super til at få navn og alder
        super(name, age); //Character Konstruktøren, name og age.
    }
    //Overrider action fra Character
    @Override
    public void action() {
        System.out.println("Health:  [##########] 100%");
        System.out.println("Energy:  [#######   ] 20%");
        System.out.println(name + "is shooting his blaster at his target!");
    }
    public void hunt(){
        System.out.println(name + " is locked in on the target");
    }
}

public class CloneTrooper extends Character {

    public CloneTrooper(String name, int age) {
        //Bruger Super til at få navn og alder
        super(name, age); //Character Konstruktøren, name og age.
    }
    //Overrider action fra Character
    @Override
    public void action() {
        System.out.println("Health:  [#####     ] 50%");
        System.out.println("Energy:  [##########] 100%");
        System.out.println(name + " is shooting his blaster at the Sith!");
    }
}

abstract class Character {
        protected String name;
        protected int age;

        // Karakter Metoden
        public Character(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Denne metode kan overrides i underklasser
        public abstract void action();


        //getter
        public String getName() {
            return name;
        }
        //Er med til at placere karakteren i verden i main
        public final void goLive(){
            System.out.println(name + " is now in the world and ready to battle!");
        }
        //Viser Alder og Navn for Karakterene
        public void showInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }



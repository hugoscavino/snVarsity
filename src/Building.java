public class Building {
    public Building() {
        System.out.println("Constructing Building");
    }
    public Building(String name) {
        this();
        System.out.println("Building name :" + name);
    }
}

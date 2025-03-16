public class House extends Building {
    public House() {
        System.out.println("Constructing House");
    }
    public House(String name) {
        this();
        System.out.println("House name :" + name);
    }

    public static void main(String[] args) {
        House house = new House("Orcid");
    }
}

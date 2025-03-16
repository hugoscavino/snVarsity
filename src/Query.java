public class Query {
    private static String someString = "Hello";
    private String name;
    public Query(String newName) {
        name = newName;
    }
    public static void main(String[] args) {
        Query q = new Query("Alice");
        changeString(someString);
        changeName(q);
        System.out.println(someString + q.name);
    }
    public static void changeString(String str) {
        str = "Welcome";
    }
    public static void changeName (Query q) {
        q.name = "Brown";
    }
}

import java.util.ArrayList;
import java.util.List;

public class Page13 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("C");
        items.add("S");
        items.add("E");
        items.add("1");
        items.add("1");

        List<String> expected = new ArrayList<>(items.subList(0, 2));
        System.out.println("Expected : " + expected);

        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).equals("E") || items.get(i).equals("1")) {
                items.remove(i);
                System.out.println("items post removed: " + items);
            }
        }

        for(String item : expected) {
            System.out.print(item + " ");
        }
        System.out.println();

        for(String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

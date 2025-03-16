import java.util.Objects;

public class StoreItem {
    private String name;
    private int expMon;
    private int expWeek;

    public String getName() {
        return name;
    }

    public int getExpMon() {
        return expMon;
    }

    public int getExpWeek() {
        return expWeek;
    }

    public StoreItem() {
        this.name = "NoName";
        this.expMon = 1;
        this.expWeek = 1;
    }
    public StoreItem(String name, int expMon, int expWeek) {
        this.name = name;
        this.expMon = expMon;
        this.expWeek = expWeek;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StoreItem storeItem)) {
            return false;
        }

        return storeItem.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

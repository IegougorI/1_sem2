import java.util.Objects;

public abstract class Item extends TextObject {

    private String amount;
    private TextObject place;
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void getAmount() {
        System.out.println("amount " + amount);
    }

    protected String name;
    public Item(String name) {
        super(name);
        this.name = name;
    }

    public Item(String name, TextObject place) {
        super(name);
        this.name = name;
        this.place = place;
    }

    public void setPlace(TextObject place) {
        this.place = place;
    }
    public TextObject getPlace() {
        return place;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(amount, item.amount) && Objects.equals(place, item.place) && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, place, name);
    }
}
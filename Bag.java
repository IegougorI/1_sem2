import java.util.ArrayList;
import java.util.Objects;

public class Bag extends Item {
    private final String name;
    private Person owner;
    public Bag(String name, Person owner) {
        super(name);
        this.name = name;
        this.owner = owner;
        owner.setBag(this);
    }


    public void putInBag(GroupPersons persons, Bag bag, Item item) {
        item.setPlace(bag);
        bagItems.add(item);
        System.out.println(persons.getName() + " put " + item + " in " + owner + "'s " + name);
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }

    protected ArrayList<Item> bagItems = new ArrayList<>();

    @Override
    public String toString() {
        return "Bag{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                ", bagItems=" + bagItems +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return Objects.equals(name, bag.name) && Objects.equals(owner, bag.owner) && Objects.equals(bagItems, bag.bagItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, bagItems);
    }
}


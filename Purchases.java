import java.util.Objects;

public class Purchases extends Item {

    private Town town;
    private String name;
    private Person owner;
    public Purchases(String name, Person owner) {
        super(name);
        this.name = name;
        this.owner = owner;
        owner.setPurchases(this);
    }

    public Purchases(String name) {
        super(name);
        this.name = name;
    }

    public Purchases(String name, Town town) {
        super(name);
        this.name = name;
        this.town = town;
        }

    public String setName() {
        return name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }

    public Town getTown() {
        return town;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchases purchases = (Purchases) o;
        return town == purchases.town && Objects.equals(name, purchases.name) && Objects.equals(owner, purchases.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(town, name, owner);
    }
}

import java.util.Objects;

public class Money extends Item {
    private String amount;
    private String name;
    private Person owner;

    public Money(String name, String amount, Person owner) {
        super(name);
        this.name = name;
        this.amount = amount;
        this.owner = owner;
        owner.setMoney(this);
    }

    public Money(String name) {
        super(name);
        this.name = name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount='" + amount + '\'' +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount) && Objects.equals(name, money.name) && Objects.equals(owner, money.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, name, owner);
    }
}
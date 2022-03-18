import java.util.Objects;

public class Train extends TextObject implements TrainStatus{
    private final String name;
    private Town destination;

    private boolean isOnStation;

    public Train(String name, Town destination, boolean onStation) {
        super(name);
        this.name = name;
        isOnStation=onStation;
        this.destination =destination;
    }

    public static class Carriage extends Item {
        private boolean isManyPeople;
        private boolean  isFreePlace;

        public Carriage (String name, boolean manyPeople, boolean freePlace){
            super(name);
            this.name = name;
            isManyPeople = manyPeople;
            isFreePlace = freePlace;
        }

        public static class Bench extends Item{
            public Bench(String name){
                super(name);
                this.name = name;
            }
        }

        public boolean getIsFreePlace() {
            return isFreePlace;
        }

        public void setFreePlace(boolean freePlace) {
            isFreePlace = freePlace;
        }

        public boolean getIsManyPeople() {
            return isManyPeople;
        }

        public void setManyPeople(boolean manyPeople) {
            isManyPeople = manyPeople;
        }
    }

    public boolean isOnStation() {
        return isOnStation;
    }

    public void arrived() {
        System.out.println(name + " arrived to railway station");
        isOnStation=true;
    }

    public void departed() {
        System.out.println(name + " departed from railway station");
        isOnStation=false;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", destination=" + destination +
                ", isOnStation=" + isOnStation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return isOnStation == train.isOnStation && Objects.equals(name, train.name) && destination == train.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, destination, isOnStation);
    }
}

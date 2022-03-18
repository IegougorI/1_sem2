public class Main {
    public static void main(String[] args) throws Exception {

        Person Ponchik = new Person("Ponchik");
        Person Piskarik = new Person("Piskarik");
        Person Leshik = new Person("Leshik");
        Person Somik = new Person("Somik");
        Person Sudachok = new Person("Sudachok");
        GroupPersons group1 = new GroupPersons("Piskarik, Leshik, Somik and Sudachok", Piskarik, Leshik, Somik, Sudachok);
        group1.sayNothing("Say nothing to anyone");
        Money money = new Money("", "All", group1);
        group1.collectMoney();

        Food food = new Food("food");
        group1.buy(food);
        Town townFantomas = new Town(){
            @Override
            public Towns getName(){
                return Towns.FANTOMAS;
            }
            @Override
            public String toString(){
                return "Fantomas";
            }
        };

        Purchases ticket = new Purchases("ticket", townFantomas);
        group1.buy(ticket);
        ticket.setOwner(Ponchik);

        Bag bag = new Bag("bag", Ponchik);
        bag.putInBag(group1, bag, food);

        System.out.println(ticket.getOwner() + " owner of " + ticket.getName() + " to " + ticket.getTown());

        GroupPersons group2 = new GroupPersons("Piskarik, Leshik, Somik, Sudachok and Ponchik");
        group2.add2groupPerson(Ponchik);
        group2.arrived2RailwayStation();

        Train train = new Train("train", townFantomas, false);
        if (!train.isOnStation()) {
            group2.waitForTrain("wait for", train);
            train.arrived();
        }
        else {
            throw new Exceptions("train on station");
        }
        Ponchik.sayGoodBye("say Goodbye to his friends");
        Ponchik.enterInTrain("enter in train");
        train.departed();

        Train.Carriage carriage = new Train.Carriage("carriage", true, true);
        Train.Carriage.Bench bench = new Train.Carriage.Bench("bench");

        if (carriage.getIsManyPeople()){
            System.out.println("In carriage many people");
        }
        else {
            System.out.println("In carriage not many people");
        }

        if (carriage.getIsFreePlace()){
        Ponchik.setPlace(bench);
        System.out.println("Ponchik managed to find place on the bench");
        Ponchik.sitComfort( "sit comfortable on ", Ponchik);
        }
        else {
        System.out.println("Ponchik didn't find place");
        }

        Ponchik.listen("started listen to people in train");
    }
}

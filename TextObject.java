public abstract class TextObject {
    private final String name;
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.getName();
    }
    public TextObject(String name){
        this.name = name;
    }
}
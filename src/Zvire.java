public class Zvire {
    protected String name;
    protected String description;

    @Override
    public String toString() {
        return "Zvire{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Zvire(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

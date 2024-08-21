package seminar_006;

public abstract class Cat {
    public String name;
    public int age;
    public String breed;
    public String hostName;

    @Override
    public String toString() {
        return String.format("Имя котика: %s\nИмя владельца котика: %s\n",name, hostName);
    }
}

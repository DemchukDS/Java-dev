package Lecture_006;

public class Worker {
    int id;
    int salery;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d Name: %s %s", id, firstName, lastName);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Worker temp = (Worker) obj;
        return id == temp.id && firstName == temp.firstName;
    }
}

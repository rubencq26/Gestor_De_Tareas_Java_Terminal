package model;

public class Task implements java.io.Serializable{

    private int id;
    private String name;
    private boolean completed;

    public Task() {
    }

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        String estado = completed ? "[X]" : "[ ]";
        return id + ". " + estado + " " + name;
    }
}

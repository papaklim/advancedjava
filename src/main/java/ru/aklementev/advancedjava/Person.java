package ru.aklementev.advancedjava;

@Author(name="aklementev", dateOfCreation=2021)
public class Person {
    private String name;
    private int id;

    public Person() {
        this.name = "No name";
        this.id = 1;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

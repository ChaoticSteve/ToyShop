package Classes;

import Interfaces.iToy;

public class Toy implements iToy {
    private int id;
    private String name;
    private int frequency;
    public Toy(int id, String name, int frequency){
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getFrequency() {
        return this.frequency;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}

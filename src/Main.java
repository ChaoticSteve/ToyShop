import Classes.Toy;
import Classes.ToyCollection;
import Classes.ToyFactory;
import Interfaces.iToy;
import Interfaces.iToyFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        iToyFactory toyFactory = new ToyFactory();
        ArrayList<iToy> toys = new ArrayList<iToy>();
        toys.add(toyFactory.createToy(1, "конструктор", 2));
        toys.add(toyFactory.createToy(2, "робот", 2));
        toys.add(toyFactory.createToy(3, "кукла", 6));
        ToyCollection toyCollection = new ToyCollection(toys);
        for (int i = 0; i < 10; i++){
            //System.out.println(toyCollection.getToy());
            toyCollection.writeToyToOutputFile(toyCollection.getToy());
        }
    }
}
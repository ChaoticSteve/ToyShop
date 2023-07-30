package Classes;

import Interfaces.iToy;
import Interfaces.iToyFactory;

public class ToyFactory implements iToyFactory {
    @Override
    public iToy createToy(int id, String name, int frequency) {
        return new Toy(id, name, frequency);
    }
}

package Classes;

import Interfaces.iToy;
import Interfaces.iToyCollection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ToyCollection implements iToyCollection {
    private PriorityQueue<iToy> toyQueue;

    public ToyCollection(ArrayList<iToy> toysList) {
        this.toyQueue = new PriorityQueue<iToy>((t1, t2) -> t2.getFrequency() - t1.getFrequency());
        for (iToy toy : toysList) {
            this.toyQueue.add(toy);
        }
    }

    @Override
    public void addToyToQueue(iToy toy) {
        this.toyQueue.add(toy);
    }

    @Override
    public iToy getToy() {
        return toyQueue.poll();
    }

    @Override
    public void writeToyToOutputFile(iToy toy) {
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            if (toy != null) {
                fw.write(toy.toString() + "\n");
            } else {
                fw.write("Queue is empty\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

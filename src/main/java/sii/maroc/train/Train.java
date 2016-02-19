package sii.maroc.train;

import java.util.LinkedList;
import java.util.ListIterator;

import sii.maroc.wagon.Wagon;
import sii.maroc.wagon.WagonsFactory;

public class Train {

    private LinkedList<Wagon> wagons;

    public Train(String wagonString) {
        wagons = WagonsFactory.getInstance().buildWagons(wagonString);
    }

    public void detachEnd() {
        wagons.removeLast();
    }

    public void detachHead() {
        wagons.removeFirst();

    }

    public boolean fill() {
        final ListIterator<Wagon> wagonIterator = wagons.listIterator();
        while (wagonIterator.hasNext()) {
            Wagon wagon = wagonIterator.next();
            if (wagon.isEmpty()) {
                wagon.fill();
                return true;
            }
        }
        return false;
    }

    public String print() {
        StringBuilder paintTrain = new StringBuilder();
        paintWagons(paintTrain);
        return paintTrain.toString();
    }

    private void paintWagons(StringBuilder paintTrain) {
        final ListIterator<Wagon> wagonIterator = wagons.listIterator();
        while (wagonIterator.hasNext()) {
            paintTrain.append(wagonIterator.next().paint());
            if (wagonIterator.hasNext())
                paintTrain.append("::");
        }
    }

}
